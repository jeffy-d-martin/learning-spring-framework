package com.beancreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean bean = context.getBean("myBean", MyBean.class);
        System.out.println(bean);
    }
}