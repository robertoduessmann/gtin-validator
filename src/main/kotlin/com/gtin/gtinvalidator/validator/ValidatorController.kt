package com.gtin.gtinvalidator.validator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ValidatorController{

    @GetMapping("/")
    fun hello() = "Hallo!"
}