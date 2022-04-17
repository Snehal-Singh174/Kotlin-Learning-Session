/*
 * Statement- Create different arrays of trains with their Name, Source, Destination and DepartureTime,
 * For example: Rajdhani, Surat, Delhi, 10:30 AM. Now write a program that can filter train details by entering input in command-line arguments from its Name, Source, Destination, DepartureTime.
 * Example 1:
 * Input: DepartureTime 10:30
 * Output: will return trains which have DepartureTime 10:30AM
 * Example 2:
 * Input: Destination Delhi
 * Output: will return trains which have destination Delhi
 */


fun arraysOfTrain(): List<Map<String, String>> {
    val listOfMaps = listOf(
    mapOf("name" to "Rajdhani", "source" to "Surat", "destination" to "Delhi", "departureTime" to "10:30 AM"),
    mapOf("name" to "Tapti", "source" to "Surat", "destination" to "Bihar", "departureTime" to "11:30 AM"),
    mapOf("name" to "Shramic", "source" to "Surat", "destination" to "Chennai", "departureTime" to "10 AM")
    )
    return listOfMaps;
}

fun main(args: Array<String>) {
    if(args.size==2){
      	val listOfTrains = arraysOfTrain();
    	  for(items in listOfTrains){
            for((key,value) in items) {
                if( key.uppercase() == args[0].uppercase() 
            && value.uppercase() == args[1].uppercase()){
                    println(items)
                }
            }
    	} 
    } else {
        print("Please provide the input")
    }
}
