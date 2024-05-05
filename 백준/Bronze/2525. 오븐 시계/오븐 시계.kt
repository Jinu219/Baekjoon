fun main() {
    val (input1, input2) = readln().split(" ")
    var hours = input1.toInt()
    var mins = input2.toInt()
    val ovenTime = readln().toInt()
    mins += ovenTime
    while (mins >= 60) {
        if (mins >= 60) {
            hours++
            mins -= 60
        } else break
    }
    if (hours >= 24) {
        hours -= 24
    }
    println("${hours} ${mins}")
}