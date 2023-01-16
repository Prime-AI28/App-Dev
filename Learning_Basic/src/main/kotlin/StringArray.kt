fun main(){
    val eg = "Array"
    val numbers = arrayOf(1,2,3,4,5)

    //string template : $ works as a placeholder, we can also use expression using {}
    println("Length of the $eg is ${numbers.size} ") // getting the size and using an expression in the String
    println("The num at second pos : ${numbers.get(1)}") // getting the element at the specific index
    numbers.set(3,5)// setting the 4th elements (i.e. 3rd indexed) to 5
    numbers[4] = 10// replacing 5th element of the array
    println(numbers.joinToString(",")) // printing all the elements of array by converting to string

    //creating a zero array using Array function
    val arrzero = Array(4){0}
    println(arrzero.joinToString(","))
}