fun main(){
    // type conversion
    val a:Int = 10
    val b: Long = a.toLong()
    println(b)
    // type check
    val name: Any = "Yash"
    if (name is String){
        println(name)
    }
    // type Casting
    val me: String = name as String
    println(me)

    //for non-compatible type use safe cast operator
    val x: Int = 10
    val z:Long? = x as? Long
    println(z)
}