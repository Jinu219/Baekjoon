fun main(){
    val number = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    val findNumber = readln().toInt()
    var result = 0
    for(i in numbers.indices){
        if(numbers[i] == findNumber) result ++
    }
    println(result)
}