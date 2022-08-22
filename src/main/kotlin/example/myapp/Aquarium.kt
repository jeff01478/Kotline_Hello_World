package example.myapp

class Aquarium(var width: Int = 40, var height: Int = 100, var length: Int = 50) {

    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} l")
    }

    constructor(numberOfFish: Int): this(){
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    fun printSize(){
        println("width: $width")
        println("height: $height")
        println("length: $length")
    }
}