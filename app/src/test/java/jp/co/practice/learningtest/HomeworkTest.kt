package jp.co.practice.learningtest

import com.google.common.truth.Truth.assertThat
import jp.co.practice.learningtest.Homework.fib
import org.junit.Test


class HomeworkTest{
    @Test
    fun `fib(0) = 0`(){
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }
    @Test
    fun `fib(1) = 1`(){
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(n) = fib(n-2) + fib(n-1)`(){
        val n = 4
        val result = Homework.fib(n)
        assertThat(result).isEqualTo(fib(n-2) + fib(n-1))
    }

    @Test
    fun `"(a * b))" should return false`(){
        val result = Homework.checkBraces("(a*b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `"(a * b)" should return true`(){
        val result = Homework.checkBraces("(a*b)")
        assertThat(result).isTrue()
    }
    @Test
    fun `")(" should return false`(){
        val result = Homework.checkBraces(")(")
        assertThat(result).isFalse()
    }
}