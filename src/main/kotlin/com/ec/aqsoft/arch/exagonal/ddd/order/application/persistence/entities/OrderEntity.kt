package com.ec.aqsoft.arch.exagonal.ddd.order.application.persistence.entities

import com.ec.aqsoft.arch.exagonal.ddd.order.domain.Order

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "turbo_order")
class OrderEntity {
    val rappiId: Int
    var nameRt: String
    var status: Int = 0
    @Id
    @GeneratedValue
    val id: Int = 0


    constructor(rappiId: Int, nameRt: String, status: Int) {
        this.rappiId = rappiId
        this.nameRt = nameRt
        this.status = status
    }

    fun toDomain(): Order {
        return Order(id, rappiId,nameRt,status)
    }
}