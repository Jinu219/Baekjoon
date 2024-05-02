fun main(){
    val numbers = readln().toInt()
    var sum = 1
    for(i in 1..numbers){
        sum *= i
    }
    print(sum)
}