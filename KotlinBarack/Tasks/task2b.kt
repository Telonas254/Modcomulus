// Write a aprogramm that takes three numbers and returns the largest number between the three.
fun main(){
    val number1 = 20
    val number2 = 30
    val number3 = 50
    
    if(number1>number2 && number1>number3){
        println("$number1 the largest of the three numbers.")
    }
    else if(number2>number3 && number2>number1){
        println("$number2 is the Largest of the three")
    }
    else{
        println("$number3 is the largest of the three")
    }
}
