

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to our app!")

    println("Please enter your username:")
    val username = scanner.nextLine()


    println("Please enter your password:")
    val password = scanner.nextLine()

    if (validateCredentials(username, password)) {
        println("Login successful! Welcome, $username")
    } else {
        println("Invalid username or password. Please try again.")
    }
}
fun validateCredentials(username: String, password: String): Boolean {
    // TODO: Replace with real authentication mechanism, such as checking a database

    val validUsers = mapOf(
        "admin" to "Rinat",
        "test_user" to "123"
    )

    return validUsers[username] == password // Checks if username exists and password matches
}