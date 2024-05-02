import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    val sum = IntArray(size)

    for (i in 0 until size) {
        val (num1, num2) = br.readLine().split(" ").map { it.toInt() }
        sum[i] = num1 + num2
    }

    for (i in 0 until size) {
        bw.write(sum[i].toString())
        if (i != size - 1) bw.write(" ")
    }

    bw.flush()
    bw.close()
    br.close()
}