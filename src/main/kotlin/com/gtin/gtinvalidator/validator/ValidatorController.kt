package com.gtin.gtinvalidator.validator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ValidatorController {

    @GetMapping("/{gtin}")
    fun isValid(@PathVariable gtin: String) = Gtin(gtin).isValid()
}