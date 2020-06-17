package com.qiwi.notification_handler.web.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicRestController {

    @GetMapping(value = ["/healthcheck"])
    fun healthCheck(): ResponseEntity<String> = ResponseEntity.ok("OK")
}