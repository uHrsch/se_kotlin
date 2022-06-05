fun main(){
    //datatypes
    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val mystring: String = "Hello"      // String


    //arrays
    var myArray = arrayOf(1, 2, 3)
    println (myArray[0])
    myArray[0] = 6
    println (myArray[0])

    //operators
    var sum1 = 100 + 50       // 150 (100 + 50)
    var sum2 = sum1 + 250     // 400 (150 + 250)
    println(sum1)
    println(sum2)

    //assignment operators
    var base = 5
    base += 5 // base = base + 5
    base -= 5 // base = base - 5
    base *=5 // base = base * 5
    base /= 5 // base =  base / 5
    base %= 5 // base = base % 5
    println(base)

    //comparison operators
    var op1 = 5
    var op2 = 3
    op1 == op2 //false
    op1 != op2 // true
    op1 > op2 // true
    op1 < op2 // false
    op1 >= op2 //true
    op1 <= op2 // false

    //conditions

    if (op1 > op2){
        op2 = op1
    }
    else if (op1 == op2) {
        op2 += op1
    }
    else{
        op2 %= op1
    }

    val day = 4
    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    //loops

    while(op2 != 2){
        if (op1 > op2){
            op2 = op1
        }
        else if (op1 == op2) {
            op2 += op1
        }
        else{
            op2 %= op1
        }
    }

    for (x in myArray){
        println(x)
    }

    myArray[0] = 6
    println (myArray[0])

    prints(myNum, myDoubleNum, myLetter, myBoolean, mystring)

}

fun prints(myNum: Int, myDoubleNum: Double, myLetter: Char, myBoolean: Boolean, mystring: String){
    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(mystring)
}