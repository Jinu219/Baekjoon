fun main(){
    val numbers = readln().split(" ").map { it.toInt()}.toMutableList()
    println(cal(numbers))
}

fun cal(numbers:MutableList<Int>):Int{
    var sum = 0
    for(i in numbers.indices){
        numbers[i] = numbers[i] * numbers[i]
    }
    for(i in numbers.indices){
        sum += numbers[i]
    }
    var result = sum % 10
    return result
}