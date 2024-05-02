fun main(){
    val inputString = readln()
    val num = readln().toInt()
    val charList = mutableListOf<Char>()

    for(char in inputString){
        charList.add(char)
    }

    println(charList[num-1])

}