fun main(){
    val num = readln().toInt()
    val charList = mutableListOf<Char>()
    val result = mutableListOf<String>()
    for (i in 1..num){
        val (dup,string) = readln().split(" ")
        for(char in string){
            for(i in 1..dup.toInt()){
                charList.add(char)
            }
        }
        result.add(charList.joinToString(""))
        charList.clear()
    }
    for(i in result.indices){
        println(result[i])
    }
}