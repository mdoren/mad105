fun main(){
    println("Enter the temperature (in Fahrenheit): ")

    var temperature = 0
    temperature = readLine()!!.toInt()

    if (temperature < 92.0) {
        println("It is low!")
    } else if (temperature > 104.0) {
        println("It is high!")
    } else {
        println("It is normal.")
    }
    //decimals and other forms of text will give errors. I have the code changing user input to integers
    //so decimals will result in failures.
}