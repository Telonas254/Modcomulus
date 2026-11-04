fun main(){
    // 4. Booleans:Stores two instance values. 
        // We use Booleans(true/false) together with Comparison Operators to form conditions.
            println(5 < 8)
            println(6==8)
    // 5. Arrays and Collections
    // 6. ArrayList,Maps


    // Arithmetic Operators
    // (+,-,*,/,%)
    val firstNumber : Int = 200
    val secondNumber : Int = 300
    var answer : Int = firstNumber + secondNumber
    println("The Result is $answer")



    // 1. Create a program to calculate the following:
        // a). Simplest Interest.
            val principle : Int = 50000
            val interestRate : Int = 12
            val time : Int = 5
            var resultant : Int = principle*interestRate*time
            var result : Int = resultant/100
            println("The Simple Interest amounts to $result")
        // b). Body Mass Index.
            val weight : Double = 75.00
            val height : Double = 183.00
            val heightNew : Double = height*height
            var bmi : Double = weight/heightNew
            println("The Basal Metabolic Rate amounts to $bmi")
        // c). Circumference.
            val pie : Double = 3.142
            val diameter : Int = 14
            var circumference : Double = pie*diameter
            println("The circumference amounts to $circumference")
        // d). Volume of a Sphere.
            val piee : Double = 3.142
            val constant : Int = 4/3
            val radius : Int = 21
            val measure : Int = radius*radius*radius
            var sphereVol : Double = piee*constant*measure 
            println("The Volume of the Sphere amounts to $sphereVol")
        // e). Volume of a Cylinder
            val pieee : Double = 3.142
            val heightt : Double = 14.74
            val radiuss : Int = 28
            var cylinderVol : Double = pieee*heightt*radiuss
            println("The Volume of the Cylinder amounts to $cylinderVol")
    // End Main
}