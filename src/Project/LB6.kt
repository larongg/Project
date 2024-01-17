package Project

import java.util.*
fun main() {
    val s = Scanner(System.`in`)
    println("Через пробел введите числа для заполнения массива: ")
    val arr = s.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    println("Исходный массив: " + Arrays.toString(arr))
    s.close()
    //Задание №1
    var sum : Double = 0.0;
    var count : Double = 0.0;
    for (i in arr.indices) {
        if (arr[i] > 0) {
            sum += arr[i];
            count++;
        }
    }
    println("Среднее значение положительных элементов: " + sum/count)
}

