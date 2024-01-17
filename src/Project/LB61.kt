package Project

import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    println("Через пробел введите числа для заполнения массива: ")
    val arr = s.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    println("Исходный массив: " + Arrays.toString(arr))
    s.close()
    for (i in arr.indices) {
        if (arr[i] < 0 && arr[i]%7 == 0){
            arr[i] += 15;
        } else if (arr[i] > 0) {
            arr[i] = 0;
        }
        else if (arr[i] == 0) {
            arr[i] += 10;
        }
    }
    println("Обработанный массив: " + Arrays.toString(arr))
}

