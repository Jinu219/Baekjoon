fun main(){
    val num = readln().toInt()
    val numbers = mutableListOf<Int>()
    for ( i in 0..<num){
        numbers.add(readln().toInt())
    }
    numbers.sort()
    for (i in numbers.indices){
        println(numbers[i])
    }
}