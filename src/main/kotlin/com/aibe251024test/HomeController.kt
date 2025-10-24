package com.aibe251024test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun main(): String {
        return "Hello HSH!"
    }
}