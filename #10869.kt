/*
문제
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

입력
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
*/

fun main(){
  val (num1, num2) = readln().split(" ")
  val n1 = num1.toInt()
  val n2 = num2.toInt()
  println(n1+n2)
  println(n1-n2)
  println(n1*n2)
  println(n1/n2)
  println(n1%n2)
}
