package com.testyourskills

object RegistrationUtil {

    private val existigUser = listOf<String>("Enshaw", "Anam")

/* The input is not validated if
    * when username/password is empty
    * when username already exist
    * password/confirm password not match
    *password should contain atleast 2 digit
    *
    * */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        } else if (username in existigUser) {
            return false
        } else if (password != confirmPassword) {
            return false
        } else if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}