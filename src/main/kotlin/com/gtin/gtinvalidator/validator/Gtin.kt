package com.gtin.gtinvalidator.validator

data class GtinResponse(val gtin: String, val valid: Boolean)

class Gtin(val gtin: String) {

    fun isValid(): GtinResponse {
        if (gtin.toIntOrNull() == null)
            return GtinResponse(gtin, false)
        return GtinResponse(gtin, true)
    }
}
