package com.testyourskills

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest {

    @Test
    fun `empty username   return false`() {
        val result = RegistrationUtil.validateRegistrationInput("", "1231", "123")
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput("Test", "", "")
        assertThat(result).isFalse()
    }
    @Test
    fun `valid  username and password return false`() {
        val result = RegistrationUtil.validateRegistrationInput("Test", "123", "123")
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exist return false`() {
        val result = RegistrationUtil.validateRegistrationInput("Enshaw", "123", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrect confirm password  return false`() {
        val result = RegistrationUtil.validateRegistrationInput("Enshaw", "123", "125")
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password return false`() {
        val result = RegistrationUtil.validateRegistrationInput("Enshaw", "1abc", "1abc")
        assertThat(result).isFalse()
    }

}