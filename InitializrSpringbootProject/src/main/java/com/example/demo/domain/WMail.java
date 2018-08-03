/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.domain;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class WMail implements Serializable{
    private WHeader WHeader;
    private String message;

    public WHeader getWHeader() {
        return WHeader;
    }

    public void setWHeader(WHeader WHeader) {
        this.WHeader = WHeader;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
