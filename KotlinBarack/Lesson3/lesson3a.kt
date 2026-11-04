import java.util.Scanner
fun main(){
    // Requesting inputs
    // Scanner
    val input =Scanner(System.`in`)

    // Number
    println("Enter Marks!!")
    val marks : Int = input.nextInt()
    println("Your Mark is $marks")

    // Text-String
    println("Enter Mame!!")
    val name : String = input.nextLine()
    println("Your name is $name")

    // Double-> Decimal
    println("Enter Temperature!!")
    val bodyTemperature :Double = input.nextDouble()
    println("Your temperature is $bodyTemperature")
}