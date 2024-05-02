fun main(){
    val num1 = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    println("${numbers.min()} ${numbers.max()}")
}