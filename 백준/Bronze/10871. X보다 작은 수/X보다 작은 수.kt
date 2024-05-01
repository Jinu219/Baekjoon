fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }

    for (num in numbers) {
        if (num < x) {
            print("$num ")
        }
    }
}