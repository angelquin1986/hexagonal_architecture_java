package com.ec.aqsoft.arch.exagonal.ddd.order.application.configuration

import com.ec.aqsoft.arch.exagonal.ddd.order.OrderApplication
import com.ec.aqsoft.arch.exagonal.ddd.order.application.persistence.repositories.OrderRepository
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.service.OrderService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackageClasses = [OrderApplication::class])
class BeanConfiguration {
    @Bean
    fun orderService(
            orderRepository: OrderRepository): OrderService {
        return OrderService(orderRepository)
    }
}
