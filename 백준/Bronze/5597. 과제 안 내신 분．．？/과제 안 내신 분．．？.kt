fun main(){
    var numbers = mutableListOf<Int>()
    for(i in 0..<28){
        numbers.add(readln().toInt())
    }
    var result = mutableListOf<Int>()
    for(i in 1..30){
        if(i !in numbers) result.add(i)
    }
    for(i in result.indices){
        println(result[i])
    }
}