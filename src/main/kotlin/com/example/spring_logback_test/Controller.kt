package com.example.spring_logback_test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")

class Controller {
    @GetMapping

    fun sendError (): String{

    }
}