fun main(){
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println("${num1 * (num2%10)}")
    println("${num1 * (num2%100/10)}")
    println("${num1 * (num2%1000/100)}")
    println("${num1 * num2}")
}