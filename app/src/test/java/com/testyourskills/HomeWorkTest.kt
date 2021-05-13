package com.testyourskills


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeWorkTest{

    @Test
    fun `pass0 as parameter return 0`(){
        val result= HomeWork.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `pass1 as parameter return 1`(){
        val result= HomeWork.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `pass5 as parameter return 7`(){
        val result= HomeWork.fib(7)
        assertThat(result).isEqualTo(7)
    }
}