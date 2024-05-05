fun main(){
    val string = readln()
    val charList = mutableListOf<Char>()
    for(char in string) charList.add(char)
    for( i in charList.indices){
        if (charList[i] == charList[i].toUpperCase()) charList[i] = charList[i].toLowerCase()
        else if(charList[i] == charList[i].toLowerCase()) charList[i] = charList[i].toUpperCase()
    }
    val answer = charList.joinToString("")
    println(answer)

}