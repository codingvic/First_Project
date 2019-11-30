fun main() {
    println("Please enter a number")
    val num1 = readLine().toString().toInt()
    println("Please enter another number")
    val num2 = readLine().toString().toInt()
    println("Please enter an operation")
    var oper = readLine().toString()
    if (oper == "a") {
        println(doAdd(num1,num2))
    }
    else if(oper == "s"){
        println(doSubtract(num1,num2))
    }
    else if(oper == "m"){
        println(doMultiply(num1,num2))
    }
    else if(oper == "d"){
        println(doDivide(num1,num2))
    }
    else {
        println("What America did YOU grow up in?")
    }
}

fun doAdd(num1:Int, num2:Int):Int {
    return num1 + num2
}
fun doSubtract(num1:Int, num2:Int):Int {
    return num1 - num2
}
fun doMultiply(num1:Int, num2:Int):Int {
    return num1 * num2
}
fun doDivide(num1:Int, num2:Int):Int {
    return num1 / num2
}