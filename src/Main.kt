
fun main() {
    //Задание для списка
    println("Задание №1")
    val list = listOf(
        "Кот поймал мышку!",
        "Отлично!",
        "Где это произошло?",
        "Ничего страшного.",
        "Кот съел мышку.",
        "Ты уверен?"
    )
    println("Исходный список: $list")
    val newList = list.filter { !it.contains("!") && !it.contains("?") }
    println("Обработанный список: $newList")

    //Задание для словаря
    println("Задание №2")
    val s = "Если гора не идёт к Магомету, то Магомет идёт к горе."
    val charMap = mutableMapOf<Char, Int>()
    for (char in s.lowercase()) {
        if (!char.isWhitespace()) {
            charMap[char] = (charMap[char] ?: 0) + 1
        }
    }
    for ((char, count) in charMap) {
        println("$char используется $count раз")
    }
    //Задание для множества
    println("Задание №3")
    val firstSet = mutableSetOf<Int>()
    while (firstSet.size < 10) {
        firstSet.add((0..20).random())
    }
    println("Множество 1: $firstSet")
    val secondSet = mutableSetOf<Int>()
    while (secondSet.size < 10) {
        secondSet.add((0..20).random())
    }
    println("Множество 2: $secondSet")
    val set3 = firstSet.intersect(secondSet)
    println("Множество совпадений: $set3")
}

