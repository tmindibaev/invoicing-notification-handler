package com.qiwi.notification_handler.web.controller

import com.qiwi.notification_handler.web.models.NotificationDto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["qiwi/p2p"])
class P2pApiController {

    val logger: Logger = LoggerFactory.getLogger(P2pApiController::class.java)

    @PostMapping(value = ["/callbacks"])
    fun handleCallback(notification: NotificationDto) : ResponseEntity<String> {
        logger.info("Got notification from QIWI: $notification")
        return ResponseEntity.ok("error:0")
    }
}