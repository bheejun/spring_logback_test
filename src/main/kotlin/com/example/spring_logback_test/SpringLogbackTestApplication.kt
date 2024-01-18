package com.example.spring_logback_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringLogbackTestApplication

fun main(args: Array<String>) {
    runApplication<SpringLogbackTestApplication>(*args)
}
