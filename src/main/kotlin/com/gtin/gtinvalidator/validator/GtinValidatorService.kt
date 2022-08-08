package com.gtin.gtinvalidator.validator

import org.springframework.stereotype.Service

@Service
class GtinValidatorService {

	fun isValid(gtin: Gtin): GtinResponse {
		if (gtin.code.toIntOrNull() == null)
			return GtinResponse(gtin.code, false)
		return GtinResponse(gtin.code, true)
	}
}
