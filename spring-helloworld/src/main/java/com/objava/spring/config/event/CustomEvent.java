/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.config.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author shahzad
 */
public class CustomEvent
        extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "CustomEvent{" + '}';
    }
}
