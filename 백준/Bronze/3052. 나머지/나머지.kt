fun main() {
    var numbers:MutableList<Int> = mutableListOf()
    for (i in 0..9){
        numbers.add(readln().toInt())
    }
    for (i in 0..<numbers.size){
        numbers[i] %= 42
    }

    var uniqueCount = numbers.toSet().size

    println(uniqueCount)
}
