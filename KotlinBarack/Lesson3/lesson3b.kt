import java.util.Scanner
fun main(){
    // BMI input and calculating program.
        val input = Scanner(System.`in`)
    // Input Parameters.
        // Height.
    println("Enter Subject's Height!!")
    val height : Double =input.nextDouble()
    println("Subject's Height is $height!!")
        // Weight.
     println("Enter Subject's Weight!!")
     val weight : Double =input.nextDouble()
     println("Subject's Weight is $height!!")

    // Calculation.
    val height2 = height*height
    val basalmetabolicRate = weight/height2
    
    // RESULTANT OUTPUT
    println("Subject's BASAL METABOLIC RATE is $basalmetabolicRate")

    // IF STATEMENTS.
    if(basalmetabolicRate<=18.5){
        println("Underweight")
    }
    else if(basalmetabolicRate>=18.6 && basalmetabolicRate<=25){
        println("Normal")
    }
    else if(basalmetabolicRate>=26 && basalmetabolicRate<=30){
        println("Overweight")
    }
    else{
        println("Obese")
    }
}