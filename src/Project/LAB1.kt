package Project

import java.util.*
fun main() {
    //Задание №1
    val s = Scanner(System.`in`)
    println("Через пробел введите числа для заполнения массива: ")
    val arr = s.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    println("Исходный массив: " + Arrays.toString(arr))
    s.close()
    //Найти сумму элементов массива, кратных пяти
    var sum = 0
    for (i in arr.indices) {
        if (arr[i] % 5 == 0) {
            sum += arr[i]
        }
    }
    println("Сумма элементов, кратных 5: $sum")
    //Задание №2
    //Заменить значения отрицательных элементов квадратами значений, значения
    //положительных элементов увеличить на 7, а нулевые оставить без изме-нения
    for (i in arr.indices) {
        if (arr[i] < 0) {
            arr[i] *= arr[i];
        } else if (arr[i] > 0) {
            arr[i] += 7;
        }
    }
    println("Обработанный массив: " + Arrays.toString(arr))
}

