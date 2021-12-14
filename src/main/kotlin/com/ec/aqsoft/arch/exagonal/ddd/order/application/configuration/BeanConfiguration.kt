package com.ec.aqsoft.arch.exagonal.ddd.order.application.configuration

import com.ec.aqsoft.arch.exagonal.ddd.order.BaseApplication
import com.ec.aqsoft.arch.exagonal.ddd.order.infrastructure.persistence.repositories.OrderRepository
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.service.OrderService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
/**
 * Represents an application service responsible for providing access to the domain to external clients. An application
 * service orchestrates use cases, but does not contain business logic.
 */
@Configuration
@ComponentScan(basePackageClasses = [BaseApplication::class])
class BeanConfiguration {
    @Bean
    fun orderService(
            orderRepository: OrderRepository): OrderService {
        return OrderService(orderRepository)
    }
}
