package com.example.myapplicationtest

import org.junit.Assert.*
import org.junit.Test
import com.google.common.truth.Truth.assertThat


class RegistrationInfoTest{


    //if username is empty, input should not be valid. you want it to return false since username condition is not met.
    @Test
    fun emptyUsernameRetrunsFalse(){
        val result = RegistrationInfo.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    //if all fields are valid
    @Test
    fun usernameAndPasswordAreCorrectReturnsTrue(){
        val result = RegistrationInfo.validateRegistrationInput(
            "Evan",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    //if username already exists, it should return false
    @Test
    fun usernameExistsReturnsFalse(){
        val result = RegistrationInfo.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


//    if password is empty, return false

    @Test
    fun passwordIsNotGivenReturnsFalse(){
        val result = RegistrationInfo.validateRegistrationInput(
            "Evan",
            "",
            ""
        )
        assertThat(result).isFalse()

    }

    @Test
    fun passwordRepeatedIncorrectlyReturnsFalse(){
        val result = RegistrationInfo.validateRegistrationInput(
            "Evan",
            "123",
            "122"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun passwordHasLessThanThreeCharactersReturnsFalse(){
        val result = RegistrationInfo.validateRegistrationInput(
            "Evan",
            "12",
            "127"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun passwordHasLessThanTwoDigitsReturnsFalse(){
        val result = RegistrationInfo.validateRegistrationInput(
            "Evan",
            "err2",
            "err2"
        )
        assertThat(result).isFalse()
    }





}