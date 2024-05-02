fun main() {
    val subject = readln().toDouble()
    val numbers = readln().split(" ").map { it.toDouble() }
    val newNumbers: MutableList<Double> = mutableListOf()
    for (i in numbers) {
        newNumbers.add(i / numbers.max() * 100)
    }
    var sum:Double = 0.0
    for (i in newNumbers) {
        sum += i
    }
    println(sum/subject)
}
