package com.nns.practice;

import com.nns.practice.configuration.SpringAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by Nirav on 02/05/2016.
 */
public class SpringApp {
    public static void main(String[] args){
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAppConfig.class);
    }
}


