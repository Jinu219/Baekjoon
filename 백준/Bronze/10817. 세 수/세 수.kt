fun main(){
    val numbers = readln().split(" ")
    val number = mutableListOf<Int>()
    for(i in numbers.indices) number.add(numbers[i].toInt())
    number.remove(number.max())
    println(number.max())
}