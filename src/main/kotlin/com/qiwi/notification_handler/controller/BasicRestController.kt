package com.qiwi.notification_handler.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicRestController {
    @GetMapping
    fun healthCheck() = "OK";
}