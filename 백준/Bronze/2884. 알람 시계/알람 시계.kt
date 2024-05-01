fun main(){
    val (hour, min) = readln().split(" ")
    var hours = hour.toInt()
    var mins = min.toInt()
    if ( mins - 45 < 0 ) {
        hours -= 1
        mins += 15
    } else mins -= 45
    if ( hours < 0 ) {
        hours += 24
    }

    println("$hours $mins")
}