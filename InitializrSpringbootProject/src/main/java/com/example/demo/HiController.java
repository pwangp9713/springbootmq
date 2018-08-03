/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.domain.WMail;
import com.example.demo.mapper.WMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class HiController {
    @Autowired
    WMailService w;
    
    @RequestMapping("/recieve")
    public WMail recieve(){
        WMail o = w.gm();
        return o;
    }
}
