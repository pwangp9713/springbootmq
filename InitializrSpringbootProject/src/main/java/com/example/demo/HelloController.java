/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.domain.WHeader;
import com.example.demo.domain.WMail;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class HelloController {
    @Autowired
    RabbitTemplate rt;
    
    @RequestMapping("/send")
    public String send(String s, String r, String m){
        WHeader h = new WHeader();
        h.setSender(s);
        h.setReciever(r);
        WMail w = new WMail();
        w.setWHeader(h);
        w.setMessage(m);
        rt.convertAndSend("W3", "keyrouting", w);
        return "success";
    }
}
