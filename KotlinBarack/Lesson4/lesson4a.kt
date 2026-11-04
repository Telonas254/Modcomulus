fun main(){
    // Arrays:It is a data type that can be used to store multiple elements(collections) in a variable.
    val cars = arrayOf("BMW","VOLKSWAGON","Mazda","Toyota","Subaru")
    // Indexing:It is where every item is given an index value,starting from zero.
    println(cars[0])
    // Print the second and third itmes in the collection.
    // Looping through arrays
    for(car in 1..2){
        println(cars[car])
    }

    for(car in cars){
        println(car)
    }
    
}