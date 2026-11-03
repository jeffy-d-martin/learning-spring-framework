package com.dependenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ConstructorInjection.xml");

        Mobile mobile = (Mobile) applicationContext.getBean("Mobile");

        mobile.displaySpec();
    }
}
