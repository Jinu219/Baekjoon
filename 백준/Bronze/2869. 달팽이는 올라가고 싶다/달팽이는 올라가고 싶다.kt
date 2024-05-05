import kotlin.math.*
fun main(){
    val (day, night, height) = readln().split(" ")
    val countDay:Double = (height.toDouble()-night.toDouble()) / (day.toDouble() - night.toDouble())
    print(ceil(countDay).toInt())
}

