package com.example.boilerplate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CanaryTest{

    @BeforeEach
    fun setUp(){

    }

    @Test
    fun `canary 1`(){
        assertThat(true).isTrue
    }
}