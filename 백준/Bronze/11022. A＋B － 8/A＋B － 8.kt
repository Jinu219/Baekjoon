fun main(){
    val num = readln().toInt()
    val num1 = mutableListOf<Int>()
    val num2 = mutableListOf<Int>()
    val sum = mutableListOf<Int>()
    for (i in 0..<num){
        val(a,b) = readln().split(" ")
        sum.add(a.toInt() + b.toInt())
        num1.add(a.toInt())
        num2.add(b.toInt())
    }
    for(i in 0..<num){
        println("Case #${i+1}: ${num1[i]} + ${num2[i]} = ${sum[i]}")
    }
}