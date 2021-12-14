package com.ec.aqsoft.arch.exagonal.ddd.order.domain.service

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.ports.IOrderRepository
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.ports.IOrderUseCase

class OrderService(orderRepository: IOrderRepository) : IOrderUseCase {

    var orderRepository = orderRepository

    override fun findOrderById(orderId: Int): Order {
        return orderRepository.findOrderById(orderId)
    }

}