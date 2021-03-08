package jp.co.practice.learningtest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilsTest{
    @Test
    fun `empty email will return false`(){
        val result = RegistrationUtils.isInputValid(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `email already exists will return false`(){
        val result = RegistrationUtils.isInputValid(
            "Munir",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `different password and confirmPassword will return false`(){
        val result = RegistrationUtils.isInputValid(
            "Chand",
            "abcd123",
            "abcd1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password less than two digits will return false`(){
        val result = RegistrationUtils.isInputValid(
            "Chand",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid email password will return true`(){
        val result = RegistrationUtils.isInputValid(
            "Chand",
            "abcd123",
            "abcd123"
        )
        assertThat(result).isTrue()
    }
}