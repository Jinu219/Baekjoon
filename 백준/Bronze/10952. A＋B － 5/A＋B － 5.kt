fun main() {
    val sum:MutableList<Int> = mutableListOf()
    var isContinue = true
    while(isContinue){
        val (num1, num2) = readln().split(" ")
        if (num1.toInt() == 0 && num2.toInt() ==0 ) break
        val numbers = Pair(num1, num2)
        val values = numbers.toList()
        sum.add(values.sumBy { it.toInt() })
    }
    for(i in sum){
        println("$i")
    }
}