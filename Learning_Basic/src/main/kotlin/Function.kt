fun main(){
    println(volume(10, 25, 15, "cube") )
    //default argument is given
    println(volume(12, 15, 18))

}

fun volume (len: Int, wid: Int, hei: Int, shape: String = "cuboid"): Int{
    println(shape)
    println(perimeter(len, wid, hei))
    // function returns the integer as the output
    return len * wid * hei
}
//single expression function
fun perimeter(x: Int, y: Int, z: Int) = x+y+z