fun main(){
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val multip = (num1 * num2 * num3).toString()
    val numList = mutableListOf<Char>()
    var result = mutableListOf(0,0,0,0,0,0,0,0,0,0)
    for ( i in multip ){
        numList.add(i)
    }
    for(i in numList.indices){
        for( j in '0'..'9'){
            if(j == numList[i]) result[j.digitToInt()]++
        }
    }
    for( i in result.indices){
        println(result[i])
    }
}