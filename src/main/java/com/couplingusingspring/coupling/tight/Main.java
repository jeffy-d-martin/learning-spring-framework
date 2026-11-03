package com.couplingusingspring.coupling.tight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContextForTightCoupling.xml");

        DatabaseManager databaseManager = (DatabaseManager) applicationContext.getBean("databasemanager");

        System.out.println(databaseManager.getAllTheUser());
    }
}
