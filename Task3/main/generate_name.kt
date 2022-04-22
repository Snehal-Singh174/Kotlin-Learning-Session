class GenerateName(){
    fun takeTechScreenName(technology: Techs, name: String) : MutableList<String> {
        val listOfName: MutableList<String> = mutableListOf()
        val regex = Regex("[^A-Za-z]")
        val resultName = regex.replace(name, "")
        if(resultName!=null && resultName.isNotEmpty()) {
            listOfName.add(generateScreenName(technology, resultName))
            listOfName.add(generateControllerName(technology, resultName))
            listOfName.add(generateModelName(technology, resultName))
        }
        return listOfName;
    }
}

fun generateScreenName(platform: Techs, input: String): String {
    val activityName : String

    when (platform) {
        Techs.ANDROID -> {
            val lstValues = input.toLowerCase().split(' ').toTypedArray()
            activityName = "activity_" + lstValues.joinToString(separator = "_")
        }
        Techs.FLUTTER -> {
            val lstValues = input.toLowerCase().split(' ').toTypedArray()
            activityName = lstValues.joinToString(separator = "_")
        }
        Techs.IOS -> {
            val lstValues = input.capitalize().split(' ').toTypedArray()
            activityName = lstValues.joinToString(separator = "") + "View"
        }
    }
    return activityName
}

fun generateControllerName(platform: Techs, input: String): String {
    val controllerName : String

    when (platform) {
        Techs.ANDROID -> {
            val lstValues = input.capitalize().split(' ').toTypedArray()
            controllerName = lstValues.joinToString(separator = "") + "Activity"
        }
        Techs.FLUTTER -> {
            val lstValues = input.toLowerCase().split(' ').toTypedArray()
            lstValues.dropLast(lstValues.size-1)
            controllerName = lstValues.joinToString(separator = "_") + "_controller"
        }
        Techs.IOS -> {
            val lstValues = input.capitalize().split(' ').toTypedArray()
            controllerName = lstValues.joinToString(separator = "") + "ViewModel"
        }
    }
    return controllerName
}

fun generateModelName(platform: Techs, input: String): String {
    val modelName : String
    when (platform) {
        Techs.ANDROID -> {
            val lstValues = input.capitalize().split(' ').toTypedArray()
            modelName = lstValues.joinToString(separator = "") + "Model"
        }
        Techs.FLUTTER -> {
            val lstValues = input.toLowerCase().split(' ').toTypedArray()
            lstValues.dropLast(lstValues.size-1)
            modelName = lstValues.joinToString(separator = "_") + "_model"
        }
        Techs.IOS -> {
            modelName = ""
        }
    }
    return modelName
}

enum class Techs {
    ANDROID,
    IOS,
    FLUTTER,
}
