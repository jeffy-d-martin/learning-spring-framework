package com.couplingusingspring.coupling.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooselyCoupling {
    static void main() {

        // database one
//        Database database = new MySqlDatabase();
//
//        DatabaseManager databaseManager = new DatabaseManager(database);

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ApplicationContextForLooseCoupling.xml");

        DatabaseManager databaseManager = (DatabaseManager) applicationContext.getBean("Databasemanager");

        System.out.println(databaseManager.getAllTheUser());
    }
}
