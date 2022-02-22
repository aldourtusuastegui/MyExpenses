package com.acsoft.myexpenses.utils

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class ValidationTest {

    @Test
    fun validateTitle_containsValue_returnTrue() {
        assertThat(Validation.validateTitleInput("some value")).isTrue()
    }

    @Test
    fun validateTitle_isEmpty_returnFalse() {
        assertThat(Validation.validateTitleInput("")).isFalse()
    }

    @Test
    fun validateTitle_maxLengthWorst_returnFalse() {
        assertThat(Validation.validateTitleInput("some food title with a large explanation higher than thirty characters")).isFalse()
    }

    @Test
    fun validateTitle_maxLengthWell_returnTrue() {
        assertThat(Validation.validateTitleInput("Meat with potatoes and salad")).isTrue()
    }

    @Test
    fun validateAmount_isCorrect_returnTrue() {
        assertThat(Validation.validateAmountInput("250.20")).isTrue()
    }

    @Test
    fun validateAmount_isEmpty_returnFalse() {
        assertThat(Validation.validateAmountInput("")).isFalse()
    }

    @Test
    fun validateAmount_isZero_returnFalse() {
        assertThat(Validation.validateAmountInput("0")).isFalse()
    }

}