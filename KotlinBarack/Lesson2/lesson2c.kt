// Nested Condition: It is a condition inside another condition.
// ATM -->Checks the user PIN
//        Withdraw(Balance)  

fun main(){
    val pin = 1234
    val balance = 30000

    val requestedPin = 3456
    val amount = 2000

    println("Welcome to your Account")
    if (pin==requestedPin){
        println("CONGRATS")
    
        if(amount<= balance){
            println("SUCCESS")
        }
        else{
            println("INSUFFICIENT FUNDS")
        }
    }
    else{
        println("WRONG PIN")
    }
}
