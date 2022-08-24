package example.myapp

class Aquarium(var width: Int = 40, var height: Int = 100, var length: Int = 50) {

    val volume: Int
        get() = width * height * length / 1000 // 1000 cm^3 = 1 l

    fun printSize(){
        println("width: $width")
        println("height: $height")
        println("length: $length")
        println("Volume: $volume l")
    }
}