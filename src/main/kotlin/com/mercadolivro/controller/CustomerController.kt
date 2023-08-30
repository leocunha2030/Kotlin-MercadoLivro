package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerController
import model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel{
        return  CustomerModel(
            "1",
            "Leonardo",
            "email@email.com")
    }
    @PostMapping
    fun create(@RequestBody customer: PostCustomerController){
        println(customer)
    }

}