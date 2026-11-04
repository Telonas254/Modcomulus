// The else...if conditions:More than two conditions.
fun main(){
        // Grading system
            // 40-->E
            // 50-->D
            // 60-->C
            // 70-->B
            // 80-->A
    val marks : Int = 82
    if(marks==40){
        println("$marks is Grade E")
    }
    else if(marks==50){
        println("$marks is Grade D")
    }
    else if(marks==60){
        println("$marks is Grade C")
    }
    else if(marks==70){
        println("$marks is Grade B")
    }
    else if(marks==80){
        println("$marks is Grade A")
    }
    else if(marks>80){
        println("$marks is Grade A")
    }
    else {
        println("Invalid Marks try again")
    }

    // Logical Operators:It is an operation where we compare two conditions.
        // And-->&&
        // Or-->||
        // Not-->!

         // Grading system
            // 0 - 40-->E
            // 41 - 50-->D
            // 51 - 60-->C
            // 61 - 70-->B
            // 71 - 80-->A
    val marrks : Int = 52
    if(marrks>=0 && marrks <= 40 ){
        println("$marrks is Grade E")
    }
    else if(marrks>=41 && marrks <= 50){
        println("$marrks is Grade D")
    }
    else if(marrks>=51 && marrks <= 60){
        println("$marrks is Grade C")
    }
    else if(marrks>=61 && marrks <= 70){
        println("$marrks is Grade B")
    }
    else if(marrks>=71 && marrks <= 80){
        println("$marrks is Grade A")
    }
    else if(marrks>=81 && marrks <= 100){
        println("$marrks is Grade A")
    }
    else {
        println("Invalid Marks try again")
    }
}
