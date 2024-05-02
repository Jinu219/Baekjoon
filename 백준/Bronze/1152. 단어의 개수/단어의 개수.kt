fun main(){
    val text:MutableList<String> = readln().split(" ").toMutableList()
    var result = 0
    for( i in text.indices ){
        if ( text[i] != "" ) result +=1
    }
    print(result)
}