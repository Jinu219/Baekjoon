fun main() {
    val numbers: MutableList<Int> = mutableListOf()
    for (i in 0..8) {
        numbers.add(readln().toInt())
    }
    var answer = 0
    println(numbers.max())
    for (i in 0..8){
        if(numbers[i] == numbers.max()) answer = i+1
    }
    print(answer)
}