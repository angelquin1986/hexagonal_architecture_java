package com.ec.aqsoft.arch.exagonal.ddd.order.domain.ports

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order

interface IOrderUseCase {

    fun findOrderById(orderId:Int): Order
}