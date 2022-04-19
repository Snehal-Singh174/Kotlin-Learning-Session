/*
    Task Statement:
    1. Create a class for beverages. Currently, we provide two beverages: tea and coffee.
    2. All Beverages are made by common ingredients hotwater, milk, and sugar.
    3. Mix this ingredient by getMixture method
    4. Mix key ingredients coffee bag for coffee and tea bag for tea by addIngredients method.
    5. Get your beverage by getBeverage method but Before getting your beverage, getMixture and addIngredients must clean pot by cleanPot method
    6. Try to solve this problem using inheritance, abstract and interface class.
    Sample Output:
    Want Beverage? Enter 1 for Tea/ 2 for Coffee!
    2
    Cleaning Coffee pot...
    Your Beverage is getting ready...
    Adding hot water
    Adding hot milk
    Adding Sugar
    Coffee Bag added
    Coffee's Ready! Enjoy
 */

interface Pot{
    fun cleanPot()
}

abstract class Beverages {
    
    abstract var hotwater : String
    abstract var milk : String
    abstract var sugar : String

    abstract fun getMixture()

}

class Coffee() : Pot, Beverages() {
    
    override var hotwater : String = "Adding hot water"
    override var milk : String = "Adding hot milk"
    override var sugar : String = "Adding Sugar"

   override fun cleanPot() {
     println("Cleaning Coffee pot...")
   }
   
   override fun getMixture() {
       println("Your Beverage is getting ready...")
       println(hotwater)
       println(milk)
       println(sugar)
   }
   
   fun addIngredients() {
       println("Coffee Bag added")
   }
   
   fun getBeverage() {
       cleanPot()
       getMixture()
       addIngredients()
       println("Coffee's Ready! Enjoy")
   }

}

class Tea() : Pot, Beverages() {
    
    override var hotwater : String = "Adding hot water"
    override var milk : String = "Adding hot milk"
    override var sugar : String = "Adding Sugar"

   override fun cleanPot() {
     println("Cleaning Tea pot...")
   }
   
   override fun getMixture() {
       println("Your Beverage is getting ready...")
       println(hotwater)
       println(milk)
       println(sugar)
   }
   
   fun addIngredients() {
       println("Tea Bag added")
   }
   
   fun getBeverage() {
       cleanPot()
       getMixture()
       addIngredients()
       println("Tea's Ready! Enjoy")
   }

}

fun main(args: Array<String>) {
    println("Want Beverage? Enter 1 for Tea/ 2 for Coffee!")
    var forTea : String = '1'.toString()
    var forCoffee : String = '2'.toString()
    if(args[0]!=null){
        println(args[0])
    	if(args[0]==forTea){
            var beverages = Tea()
            beverages.getBeverage();
        } else if(args[0]==forCoffee) {
            var beverages = Coffee()
            beverages.getBeverage();
        } else println("invalid number")
    }
}
