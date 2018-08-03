/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.domain.WMail;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author root
 */
@Component
public class WMailService {
    WMail m;
    
    @RabbitListener(queues="W4")
    public void recieve(WMail m){
        this.m = m;
    }
    
    public WMail gm(){
        return m;
    }
}
