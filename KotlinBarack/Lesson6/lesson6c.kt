// Inheritance: Mechanism where one class(Child/Sub class) can inherit properties and behaviours of another class(Parent/Super class).

fun main(){
    val objectFish = Fish()
    objectFish.swim()
    objectFish.eat()

    val objectTilapia = Tilapia()
    objectTilapia.jump()
    objectTilapia.swim()
    objectTilapia.eat()
}//END MAIN

// FISH(Parent) class-->TILAPIA(Child) class

// ======FISH(parent) CLASS=====
open class Fish{
    // Properties
    var age : Int = 6
    var size : Double = 0.6
    // Behaviour
    fun swim(){
        println("Fish is Swimming...")
    }
    fun eat(){
        println("Fish is Eating...")
    }
}

// ======TILAPIA(child) CLASS=====
class Tilapia:Fish(){
    // Properties
    var name : String = "Tilapia"
    // Behaviours
    fun jump(){
        println("Tilapia is Jumping...")
    }
}
