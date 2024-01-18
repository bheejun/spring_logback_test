package com.example.spring_logback_test

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class Controller {
    private val logger = LoggerFactory.getLogger(Controller::class.java)

    @GetMapping

    fun sendError ():String{
        logger.info("실행완료")
        val response = "Hi"
        logger.error("bisaaaaaaaang")

        return response

    }
}