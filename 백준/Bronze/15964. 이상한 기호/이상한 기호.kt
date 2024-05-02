fun main(){
    val (num1,num2) = readln().split(" ")
    print(cal(num1.toInt(),num2.toInt()))
}

fun cal(num1:Int,num2:Int):Int{
    return((num1+num2)*(num1-num2))
}