package com.ec.aqsoft.arch.exagonal.ddd.order.application.persistence.repositories


import com.ec.aqsoft.arch.exagonal.ddd.order.application.persistence.entities.OrderEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ISprintOderRepository: CrudRepository<OrderEntity, Int> {


}