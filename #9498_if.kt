/*
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.
*/

fun main(){
    val num = readln().toInt()
    if(num in 90..100) println("A")
    else if (num in 80..89) println("B")
    else if (num in 70..79) println("C")
    else if (num in 60.. 69) println("D")
    else println("F")
}

// IntelliJ에서 if대신 when을 쓰는게 더 효율적이라고 알려줌,, 
