package example.myapp

fun main(){
    buildAquarium()
}

fun buildAquarium(){
    var myAquarium = Aquarium()
    myAquarium.printSize()

    var myAquarium2 = Aquarium(10,10,10)
    myAquarium2.printSize()

    var myAquarium3 = Aquarium(height = 30, length = 40)
    myAquarium3.printSize()

    var myAquarium4 = Aquarium(numberOfFish = 29)
    myAquarium4.printSize()
    println("Volume: ${myAquarium4.width * myAquarium4.length * myAquarium4.height / 1000} l")
}