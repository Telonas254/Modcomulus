import java.util.Scanner
val input = Scanner(System.`in`)
fun main(){
    // UserPin variable.
    var userPin : Int = 12113
    // Balance variable.
    var balance : Int = 300000
    // Looping
    var attempts = 0
    for(attempt in 1..3){
       println("Enter Pin $attempt")
       val requested_pin : Int= input.nextInt()
       if(requested_pin==userPin){
            println("Login is a succes")           
            while(true){
                println("Enter option 1 to Deposit. option 2 to withdraw")
                println("Enter option 2 to Withdraw")
                println("Enter option 0 to Exit")
                val choice : Int = input.nextInt()
                if(choice==1){
                    println("Enter Deposit amount")
                    val amount : Int = input.nextInt()
                    balance=balance+amount
                    println("Deposited Successfully")
                    println("Tour new balance is $balance")
                }
                else if(choice==2){
                    println("Input withdraw amount")
                    val withdraw : Int = input.nextInt()
                    if(withdraw>=balance){
                        println("Insufficient Funds $balance.Try a lower amount")
                    }
                    else{
                        var newBalance=balance-withdraw
                        println("Amount succesfully Withdrawn")
                        println("New balance is $newBalance")
                    }
                }
                else{
                    println("Logged out Succesfully")
                }
                break
                
            }
       }
       else{
        attempts++
            println("Incorrect PIN. Attempts remaining: ${3 - attempts}")
            if (attempts == 3) {
                println("You have exceeded the maximum number of attempts. You are blocked from the system.")
            }
       }
    }        
}