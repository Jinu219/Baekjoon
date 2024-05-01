fun main() {
    val num1 = readln().toInt()
    for (i in 1..num1) {
        for (j in 1..i){
            print("*")
            when (j){
                num1 -> break
                i -> println()
            }
        }
    }
}
