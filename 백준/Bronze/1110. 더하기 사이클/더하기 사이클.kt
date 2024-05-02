fun main(){
    val td = readln().toInt()
    val numbers:MutableList<Int> = mutableListOf()
    var cycle = 1
    // 26

    numbers.add(td/10) // 2
    numbers.add(td%10) // 6
    var i = 0
    while(true) {
        numbers.add((numbers[i] + numbers[i + 1]) % 10)
        if (numbers[i+1]*10 + numbers[i+2] == td ) break
        i ++
        cycle += 1
    }

    print(cycle)
    
}