package com.gtin.gtinvalidator.validator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GtinValidatorController(private val service: GtinValidatorService) {

	@GetMapping("/gtin/{gtin}/status")
	fun isValid(@PathVariable gtin: String): GtinResponse {
		return service.isValid(Gtin(gtin))
	}
}
