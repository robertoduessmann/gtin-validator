package com.gtin.gtinvalidator.validator

import org.junit.Assert.*
import org.junit.Test


class GtinTest {

    @Test
    fun `Assert text is not a valid Gtin`() {
        val response = Gtin("abc").isValid()

        assertFalse(response.valid)
    }

    @Test
    fun `Assert number a valid Gtin`() {
        val response = Gtin("123").isValid()

        assertEquals(response.gtin, "123");
        assertTrue(response.valid)
    }
}