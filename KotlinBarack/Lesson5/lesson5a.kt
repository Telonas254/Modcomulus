

fun main(){
    // Function:It is a block of code given a name that a does a specific job in a programming.(SPECIFIC TASK) 
    // Types of Function:
        //a). Inbuilt Function:It is a function that was already in the programming language.
        //b). User-Defined Function:It a function that is first created and then called by the user.
            //1. Creating a function:GO UOTSIDE THE MAIN FUNCTION.....
                // -->SYNTAX:Fun `name()`{body}
            // 2. Calling a function:INSIDE THE MAIN FUNCTION (execute)
                // -->SYNTAX:functionName()
    courses()
    addition(60,90)
    circle(3.142,21)
    cylinder()
    sphere()
    volcylinder(3.142,14,21)
    volsphere(3.142,52,1.333333)
    simpleint(50000,5,0.12)
    bmi(85.5,1.93)
    numbers(34,54,98)
    factor()
} //END MAIN

// Courses:
fun courses(){
    println("1. Internet of Things.")
    println("2. Data Science and Machine Learning.")
    println("3. Android Programming.")
    println("4. Cyber Security.")
}

// Add Numbers:
fun addition(number1:Int,number2:Int){
    val sum=number1+number2
    println("The result is $sum") 
}

// Write functions to do the following tasks-->
// Calculate Area of a circle:
fun circle(pi:Double,radius:Int){
    val area = pi*radius*radius
    println("The answer is $area.")
    
}
// Volume of a cylinder:
fun cylinder(){
    var pi = 3.142
    var radius = 42
    var height = 15
    val cyarea = pi*radius*radius*height
    println("The answer is $cyarea.")
}
// Volume of a sphere:
fun sphere(){
    var pi = 3.142
    var radiius = 14
    val constant = 4/3
    val spharea = pi*radiius*radiius*radiius*constant
    println("The answer is $spharea.")
}

// Parameter:It is a special variable that is passed in a function being `created`.
// Argument:It is a value that is passed inside a function while `calling` your function.
// USE PARAMETERS TO REPLACE VARIABLES.
// Volume of a cylinder:
fun volcylinder(pi:Double,radius:Int,height:Int){
    val cyyarea = pi*radius*radius*height
    println("The answer is $cyyarea.")
}
// Volume of a sphere:
fun volsphere(pi:Double,radiius:Int,constant:Double){
    val sppharea = pi*radiius*radiius*radiius*constant
    println("The answer is $sppharea.")
}


//============================== MORE ASSIGNMENTS==========================
// Calculate Simple interest:
fun simpleint(principle:Int,time:Int,rate:Double){
    val simple = principle*rate*time
    println("The interest is $simple")
}

// Calculate BMI:
fun bmi(weight:Double,height:Double){
    val bmis = weight/(height*height)
    println("The BMI is $bmis")
}

// Check the smallest numbers from 3 numbers provided:
fun numbers(num1:Int,num2:Int,num3:Int){
    if(num1<num2 && num1<num3){
        println("$num1 the smallest of the three numbers.")
    }
    else if(num2<num3 && num2<num1){
        println("$num2 is the smallest of the three")
    }
    else{
        println("$num3 is the smallest of the three")
    }
}

//Using loops and functions create Factorial:
fun factor(){
    var start = 6
    var result=1
    while(start>=1){
        result = result * start
        start = start - 1
    }
    println("The factorial is $result")
}
