package Project

//Задание №1
//Написать метод, который в переданной строке заменяет все точки на многоточие. С его
//помощью обработать пять разных строк и отобразить их на экране.
fun replaceDot(inputString: String): String {
    return inputString.replace(".", "...")
}

//Задание №2
//Написать метод, который разделяет переданную строку на две отдельных строки: первая
//содержит исходную строку до первой точки, а вторая – исходную строку после первой
//точки. С его помощью обработать пять разных строк и отобразить результаты на экране
fun divide(inputString: String): String {
    return (inputString.substringBefore(".") + "\n" + inputString.substringAfter("."))
}

fun main() {
    val Dots = arrayOf(
        "Кошка мышке не товарищ.",
        "Точки в строке отсутствуют",
        "Точка . Две точки ..",
        "Задание первое. . .",
        "Три точки ..."
    )
    println("Функция замены точек на троеточие:")
    for (string in Dots) {
        val DotsString = replaceDot(string)
        println(DotsString)
    }
    val Razdel = arrayOf(
        "Кошка мышке не товарищ.Утюг не холодильник",
        "Точка.Точка. Запятая",
        "Роза .съела хлеб",
        "две ..точки",
        "точка в середине .в середине"
    )
    println("Функция разделения по первой точке:")
    for (string in Razdel) {
        val Razd = divide(string)
        println(Razd)
    }
}

