/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class BuildController {

    @Autowired
    AmqpAdmin a;

    @RequestMapping("/build")
    public String build() {
        a.declareExchange(new DirectExchange("W5", true, false));
        a.declareQueue(new Queue("W6", true));
        a.declareBinding(new Binding("W6", Binding.DestinationType.QUEUE, "W5", "routing", null));
        return "build";

    }
}
