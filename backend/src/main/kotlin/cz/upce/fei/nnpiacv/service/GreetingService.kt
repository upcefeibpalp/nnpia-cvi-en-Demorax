package cz.upce.fei.nnpiacv.service

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun sayGreeting(): String {
        return "Hello World!";
    }
}