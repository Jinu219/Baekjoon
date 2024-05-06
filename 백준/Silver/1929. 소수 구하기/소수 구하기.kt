import kotlin.math.sqrt

fun main() {
    val (num1, num2) = readln().split(" ") // 문자열을 공백 기준으로 나누어 정수 리스트로 변환
    val result = mutableListOf<Int>() // 결과를 저장할 가변 길이 리스트
    for (i in num1.toInt()..num2.toInt() ) {
        if (isPrime(i)) {
            result.add(i)
        }
    }
    for(i in result.indices) println(result[i])
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2 .. sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
