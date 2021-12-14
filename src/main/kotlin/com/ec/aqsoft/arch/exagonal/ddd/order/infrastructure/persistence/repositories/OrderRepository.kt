package com.ec.aqsoft.arch.exagonal.ddd.order.infrastructure.persistence.repositories

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.ports.IOrderRepository
import org.springframework.stereotype.Component

@Component
class OrderRepository(sprintOrderRepository: ISprintOderRepository):IOrderRepository {

    var sprintOrderRepository = sprintOrderRepository

    override fun findOrderById(orderId: Int): Order {
        return  sprintOrderRepository.findById(orderId).get().toDomain()
    }
}