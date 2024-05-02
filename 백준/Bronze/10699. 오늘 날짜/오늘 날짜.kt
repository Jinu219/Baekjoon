import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val now = Calendar.getInstance()
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    val formattedDate = dateFormat.format(now.time)
    println(formattedDate)
}