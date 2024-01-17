package Project

fun process(inputString: String): String {
    return (inputString.reversed().toUpperCase()).replace(" ", "")
}
fun main(){
    val words = arrayOf(
        "Собака съела абрикос.",
        "Кошка Мурка живёт в Мурманске!",
        "Солнце греет Африку",
        "Тридцать три коровы",
        "И черви в речи"
    )
    for (string in words) {
        val line = process(string)
        println(line)
    }
}

