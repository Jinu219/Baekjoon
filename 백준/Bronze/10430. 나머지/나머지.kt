fun main(){
    val (num1,num2,num3) = readln().split(" ")
    val a = num1.toInt()
    val b = num2.toInt()
    val c = num3.toInt()

    println("${(a+b)%c}")
    println("${((a%c) + (b%c))%c}")
    println("${(a*b)%c}")
    println("${((a%c) * (b%c))%c}")
}