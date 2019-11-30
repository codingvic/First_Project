fun main() {
    println("Please enter a number")
    var numb1 = readLine().toString().toInt()
    println("Please enter another number")
    var numb2 = readLine().toString().toInt()
    println(doMath(numb1,numb2))
}

fun doMath(numb1:Int, numb2:Int):Int {
    return numb1 + numb2
}
