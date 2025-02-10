package cz.upce.fei.nnpiacv.controller

import cz.upce.fei.nnpiacv.service.GreetingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(private val greetingService: GreetingService) {

    @GetMapping("/")
    fun sayGreeting(): String {
        return  greetingService.sayGreeting();
    }
}