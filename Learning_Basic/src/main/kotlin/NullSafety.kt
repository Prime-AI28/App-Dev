fun main(){
    val name: String = "Prime " + "Parker"
    //val is not mutable variable
    //var is a mutable variable
    var age : Int = 20
    var status : String?
    // using Sfe call operator : "?" after the data type you can make them nullable
    printinfo(name,age, "single")
    printinfo("Harsh",19)
}

fun printinfo(name : String, age : Int, status : String? = null) {
    print(name + "\n" + age + "\n" + status + "\n")
    println(status?.length  ?: 0)
    //Elvis operator(?:) : if null then prints 0
    if (status != null) {
        println(status!!.length)
        // not-null asserted operator(!!.) : use to ensure the compiler that the data is not null
        // if the status is null then last command will show issue
    }
}