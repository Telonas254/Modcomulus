fun main() {
    var userPin = "1234"
    var balance = 1000.0
    var attempts = 0

    for (attempt in 1..3) {
        println("Please enter your PIN:")
        val enteredPin = readLine()

        if (enteredPin == userPin) {
            println("Login successful!")

            // Nested if-else for deposit or withdraw
            println("Choose an option:\n1. Deposit\n2. Withdraw")
            val choice = readLine()?.toIntOrNull()

            if (choice == 1) {
                println("Enter deposit amount:")
                val depositAmount = readLine()?.toDoubleOrNull() ?: 0.0
                balance += depositAmount
                println("Deposit of $depositAmount successful.")
                println("Current balance: $balance")
            } else if (choice == 2) {
                println("Enter withdraw amount:")
                val withdrawAmount = readLine()?.toDoubleOrNull() ?: 0.0

                if (withdrawAmount > balance) {
                    println("User has insufficient funds.")
                    println("Account balance: $balance")
                } else {
                    val remainingBalance = balance - withdrawAmount
                    balance = remainingBalance
                    println("Withdrawal of $withdrawAmount successful.")
                    println("Current balance: $balance")
                }
            } else {
                println("Invalid choice.")
            }

            break // Exit loop after successful login and transaction
        } else {
            attempts++
            println("Incorrect PIN. Attempts remaining: ${3 - attempts}")
            if (attempts == 3) {
                println("You have exceeded the maximum number of attempts. You are blocked from the system.")
                break
            }
        }
    }
}
