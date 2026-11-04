fun main(){
    // 1. OOP:Programming paradigm(style) where code is organised into objects rather tan functions(functional programming).
                    // Flask-->Functional programming.
                    // Django-->OOP.
    // 2. Object:It is an instance of a class with attributes and behaviours.
             // :It is a real world entity that contains attributes and behaviour.
    // 3. Attribute:It is what an object has.
    // 4. Behaviour:Actions that the object can undertake.
    // 5. Class:Template(Blueprint) for creating objects.
        // From a class we can get objects,therefore an object becomes an instance of class.

// ==================CREATING AN OBJECT================
// Creating an object from a class(instantiation) inside the main function.
    val objectPerson = Person()
    println(objectPerson.name)
    println(objectPerson.height)

    objectPerson.speak()
    objectPerson.walk()

    val objectCylinder = Cylinder()
    objectCylinder.findVolume()
}// END MAIN

// ===================CREATING A CLASS=======================
// OUTSIDE THE MAIN FUNCTION.
// SYNTAX
class Person{
    // Properties(variables)
    var name : String = "Davis"
    var age : Int = 23
    var height : Double = 1.73
    var weight : Double = 79.38 
    // Behaviours(functions)
    fun speak(){
        println("Davis Speaking....")
    }
    fun walk(){
        println("Davis is walking!!!")
    }
}


// ========================CLASSROOM ACTIVITIES AFTER THE LESSON====================
// Class of a Cylinder.
class Cylinder(){
    // Properties:
    var height : Int = 20
    var radius : Double = 10.0
    // Behaviours:
    fun findVolume(){
        val answer = 3.142 * radius * radius * height
        println("The answer is $answer")
    }
}