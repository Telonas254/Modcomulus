fun main(){
    val objectCalculator = Calculator()
    objectCalculator.findBMI()

    val objectSimpleint = Simpleint()
    objectSimpleint.simp()
}

class Calculator{
    // Properties:
    var weight : Double = 83.21
    var height : Double = 1.94
    // Behaviour:
    fun findBMI(){
        val result = weight/(height*height)
        println("The BMI of the subject is $result")
    }
}


// ================USING OOP CALCULATE SIMPLE INTEREST===================
class Simpleint{
    // Properties
    var principle : Int = 30000
    var time : Int = 6
    var rate : Double = 0.21
    // Behaviour
    fun simp(){
        val answer = principle*rate*time
        println("The interest ocurred is $answer")
    }
}