package com.gtin.gtinvalidator.validator

import org.junit.Assert.*
import org.junit.Test

class GtinValidatorServiceTest {

	private val service: GtinValidatorService = GtinValidatorService()

	@Test
	fun `Assert text is not a valid Gtin`() {
		val response = service.isValid(Gtin("abc"))

		assertFalse(response.valid)
	}

	@Test
	fun `Assert number a valid Gtin`() {
		val response = service.isValid(Gtin("123"))

		assertEquals(response.gtin, "123")
		assertTrue(response.valid)
	}
}
