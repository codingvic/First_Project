fun main() {
    println("Please enter a number")
    var num1 = readLine().toString().toInt()
    println("Please enter another number")
    var num2 = readLine().toString().toInt()
    println(doMath(num1,num2))
}

fun doMath(num1:Int, num2:Int):Int {
    return num1 + num2
}
