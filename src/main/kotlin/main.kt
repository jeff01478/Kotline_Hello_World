import java.util.*

fun main(args: Array<String>){
    //var num = randomNumSize(randomNum(),randomNum(),randomNum())
    println("The 3 random number ${if(randomNumSize(randomNum(),randomNum(),randomNum()) == true) "in the range 20..50" else "out to range"}")
}

fun randomNum():Int{
    var num = Random().nextInt(100)
    println(num)
    return num
}

fun randomNumSize(num1:Int,num2:Int,num3:Int): Boolean{
    return when{
        a(num1) -> false
        a(num2) -> false
        a(num3) -> false
        else -> true
    }
}

fun a(num: Int) = num < 20 || num > 50