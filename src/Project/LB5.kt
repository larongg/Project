package Project

import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    println("Введите сумму: ")
    val N = s.nextInt();
    println("Минимальное количество купюр для  выдачи $N рублей: ")
    println(calculate(N))
    s.close()
}

fun calculate(N: Int): Int {
    val banknotes = listOf(5000, 2000, 1000, 500, 200, 100, 50, 10)
    var summa = N
    var count = 0
    for (banknote in banknotes) {
        val billCount = summa / banknote
        summa %= banknote
        count += billCount
    }
    return if (summa == 0) count else -1
}

