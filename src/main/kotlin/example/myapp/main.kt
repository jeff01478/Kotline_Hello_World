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

}