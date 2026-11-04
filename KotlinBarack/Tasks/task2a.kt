// MPESA TAARIFFS
fun main(){
    val amount=1500
    if(amount >= 200 && amount<= 2500){
        println("Charge for $amount is 34")
    }    
    else if(amount >= 2501 && amount<= 5000){ 
        println("Charge for $amount is 67")
    }    
    else if(amount >= 5001 && amount<= 10000){
        println("Charge for $amount is 112")
    }
    else if(amount >= 10001 && amount<= 20000){
        println("Charge for $amount is 197")
    }
    else{
        println("Invalid  amount try again")
    }
        
}
   
    
