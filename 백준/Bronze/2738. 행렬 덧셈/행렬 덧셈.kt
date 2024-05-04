fun main(){
    val (row, col) = readln().split(" ")
    val inputProC1 = mutableListOf<List<String>>()
    val inputProC2 = mutableListOf<List<String>>()
    var result = mutableListOf<Int>()
    for(i in 0..<row.toInt()){
        inputProC1.add(readln().split(" "))
    }
    val proC1 = inputProC1.flatten()
    for(i in 0..<row.toInt()){
        inputProC2.add(readln().split(" "))
    }
    val proC2 = inputProC2.flatten()

    for (i in proC1.indices){
        result.add(proC1[i].toInt() + proC2[i].toInt())
    }
    result.add(0,0)
    for( i in 1..<result.size){

        if(i % row.toInt() == 0) println("${result[i]}")
        else print("${result[i]} ")
    }

}