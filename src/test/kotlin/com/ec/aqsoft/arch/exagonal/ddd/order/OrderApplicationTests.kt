package com.ec.aqsoft.arch.exagonal.ddd.order

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order
import com.ec.aqsoft.arch.exagonal.ddd.order.domain.service.OrderService
import com.ec.aqsoft.arch.exagonal.ddd.order.infrastructure.persistence.repositories.OrderRepository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OrderApplicationTests {
	@Mock
	private lateinit var orderRepository: OrderRepository

	private var orderService: OrderService? = null

	@BeforeEach
	fun setup() {
		orderService = OrderService(orderRepository)
	}
	@Test
	fun contextLoads() {
		Mockito.`when`(orderRepository.findOrderById(1)).thenReturn(Order(1,1,"Juan",2));
		var order = this.orderService?.findOrderById(1)
		assert(order != null && order.nameRt.equals("Juan"))

	}

}
