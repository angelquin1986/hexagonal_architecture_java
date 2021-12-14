package com.ec.aqsoft.arch.exagonal.ddd.order.domain

data class Order (
    val id: Int,
    val rappiId: Int,
    var nameRt:String,
    var status: Int
)