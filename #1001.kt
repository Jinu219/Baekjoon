// 1001
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 첫째 줄에 A-B를 출력한다.


fun main(){
    val (num1, num2) = readln().split(" ")
    println(num1.toInt() - num2.toInt())
}
