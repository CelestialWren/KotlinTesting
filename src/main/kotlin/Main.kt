package src.main.kotlin
fun main(args: Array<String>) {
    println("Hello World!")
    printYay("Gradle", 7)
    printYay("Kotlin", 82)


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}


fun yay(input: String, version: Int) = (input.plus("-").plus(version.toString()))

fun printYay(input: String, version: Int){
    println(yay(input, version))
}
