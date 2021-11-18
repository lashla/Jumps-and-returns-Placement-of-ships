import java.util.Scanner

fun main() {
    var xStr = ""
    var yStr = ""
    val sc = Scanner(System.`in`);
    var inputNumbers = IntArray(6)
    for (i in 0..5) {
        inputNumbers[i] = sc.nextInt()
    }
    loop@ for (xCoordinate in 1..5){
        for (inputX in 0..5 step 2){
            if (inputNumbers[inputX] == xCoordinate) continue@loop
        }
        xStr = xStr + " " + xCoordinate.toString()
    }
    loop@ for (yCoordinate in 1..5){
        for (inputY in 1..5 step 2){
            if (inputNumbers[inputY] == yCoordinate) continue@loop
        }
        yStr = yStr + " " + yCoordinate.toString()
    }
    println(xStr.trim())
    print(yStr.trim())
}
