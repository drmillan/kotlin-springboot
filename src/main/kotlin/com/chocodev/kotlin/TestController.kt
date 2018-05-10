package com.chocodev.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController{
    @GetMapping("/hello")
    fun hello(
            @RequestParam(value="name") name:String
    )="Hello "+name
    @GetMapping("/goodbye")
    fun goodbye(@RequestParam(value="name") name:String
    ):String="Goodbye "+name
}