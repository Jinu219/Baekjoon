fun main(){
    val num1 = readln().toInt()
    if(num1 % 4 == 0) {
        if(num1 % 100 != 0 || num1 % 400 == 0 ) println("1")
        else println("0")
    }else println("0")

}