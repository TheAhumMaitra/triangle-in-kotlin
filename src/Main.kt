fun main() {
    print("Enter height  : >")
    var height = readLine()!!.toInt()
    print("Symbol : >")
    var symbol = readLine()!!.toString()

    for ( i in 0..height){
        println(symbol.repeat(i))
    }
}