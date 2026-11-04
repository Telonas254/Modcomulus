import java.util.Scanner
fun main(){
    // When Expression: They are used to replace the`else if` statements to conserve memory and make the code more efficient.
    val input = Scanner(System.`in`)
    println("Enter Marks!")
    val marks : Int = input.nextInt()
    when(marks){
        in 0..40 -> println('E')
        in 41..50-> println('D')
        in 51..60 -> println('C')
        in 61..70 -> println('B')
        in 71..100 -> println('A')
        else ->println("!!Invalid Marks!!")
    }
    // End the `when` expression.

    // `WHEN` condition
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

            when{
                basalmetabolicRate <18.5 -> println("Underweight")
                basalmetabolicRate in 18.5..25.0 -> println("Normal")
                basalmetabolicRate in 26.0..30.0 -> println("Overweight")
                basalmetabolicRate >30.1 -> println("Obese")
                else -> println("Invalid")
            }

}
