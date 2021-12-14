package com.ec.aqsoft.arch.exagonal.ddd.order.infrastructure.controllers

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrderController {

    var orderService:OrderService

    constructor(orderService: OrderService) {
        this.orderService = orderService
    }

    @GetMapping("/{orderId}")
    fun getUser(@PathVariable("orderId") orderId: Int): Order? {
        // @RequestParam String id => Query Param
        val orderDTO: Order = orderService.findOrderById(orderId)
        return orderDTO
    }
}