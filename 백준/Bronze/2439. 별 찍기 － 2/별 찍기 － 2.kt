fun main() {
    val num1 = readln().toInt()
    for (i in 1..num1) {
        for (j in num1-1  downTo i) {
            print(" ")
        }

        for (k in 1..i) {
            print("*")
        }
        if (i != num1 ) println()
    }
}