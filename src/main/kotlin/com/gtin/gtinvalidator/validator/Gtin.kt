package com.gtin.gtinvalidator.validator

data class GtinResponse(val gtin: String, val valid: Boolean)

data class Gtin(val code: String)
