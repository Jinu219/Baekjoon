fun main(){
    val string = readln()
    val charList = mutableListOf<Char>()
    for ( char in string ) charList.add(char)
    println(charList.size)
}