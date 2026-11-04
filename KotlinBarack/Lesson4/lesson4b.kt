fun main(){
    // create an array and store 5 marks.
    val marks = arrayOf(68,55,45,74,98,89,81,25,45,75,45,75,95,58,75,45,82,46,82,64)
    // Using for loop,calculate the total marks in the array.
    // Get the total number of students.
    val items = marks.size
    println("We have $items students")
    // TotalMarks
    var totalMarks = 0
    for(mark in marks){
        totalMarks = totalMarks + mark\
    }
    println(" The total marks are $totalMarks")
    // Get Mean marks.
    val mean = totalMarks/items
    println("The mean Mark is $mean")
}.
