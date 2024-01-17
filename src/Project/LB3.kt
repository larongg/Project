package Project

// Родительский класс для ПК
open class PC(val brand: String, var model: String) {
    // Общая функция для всех ПК
    fun turnOn() {
        println("ПК $brand $model включился!")
    }

    // Функция, которая должна быть переопределена в дочернем классе
    open fun updated() {
        println("Загрузка обновлений на $brand $model...")
    }
}

// Дочерний класс для ПК на ОС Windows
class WindowsPC(brand: String, model: String, val WindowsVersion: Int) :
    PC(brand, model) {
    // Переопределенная функция
    override fun updated() {
        println("Произведено обновление $brand $model до Windows версии: $WindowsVersion")
    }
}

// Дочерний класс для ПК на ОС macOS
class macOSPC(brand: String, model: String, val macOSVersion: String) :
    PC(brand, model) {
    // Переопределенная функция
    override fun updated() {
        println("Произведено обновление $brand $model до macOS версии: $macOSVersion")
    }
}

// Использование классов
fun main() {
    val PC1 = WindowsPC("Huawei", "MateBookD15", 11)
    val PC2 = macOSPC("Apple", "MacBookAir", "12.7.1")

    PC1.turnOn()
    PC1.updated()
    PC2.turnOn()
    PC2.updated()
}

