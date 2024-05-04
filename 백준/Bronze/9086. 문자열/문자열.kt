fun main(){
    val num = readln().toInt()
    val charList = mutableListOf<Char>()
    val stringList = mutableListOf<Char>()
    val result = mutableListOf<String>()
    for ( i in 0..<num) {
        val string = readln()
        for (char in string) {
            charList.add(char)
        }
        stringList.add(charList[0])
        stringList.add(charList[charList.size - 1])
        result.add(stringList.joinToString(""))
        stringList.clear()
        charList.clear()
    }
    for(i in 0..<num){
        println(result[i])
    }
}