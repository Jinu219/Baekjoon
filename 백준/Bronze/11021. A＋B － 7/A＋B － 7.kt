fun main(){
    val size = readln().toInt()
    val sum = mutableListOf<Int>()
    for (i in 0..size-1){
        var (num1, num2) = readln().split(" ")
        sum.add(num1.toInt() + num2.toInt())
    }
    for (i in 0..size-1){
        print("Case #${i+1}: ${sum[i]}")
        if( i != size-1) println()
    }

}