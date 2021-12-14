package com.ec.aqsoft.arch.exagonal.ddd.order.domain.ports

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order

interface IOrderRepository {
    fun findOrderById(orderId: Int): Order
}