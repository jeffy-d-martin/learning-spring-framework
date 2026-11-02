package com.coupling.loose;

public class LooselyCoupling {
    static void main() {

        // database one
        Database database = new MySqlDatabase();

        DatabaseManager databaseManager = new DatabaseManager(database);

        System.out.println(databaseManager.getAllTheUser());

        // database two
        Database databaseTwo = new MySqlDatabase();

        DatabaseManager databaseManagerTwo = new DatabaseManager(databaseTwo);

        System.out.println(databaseManagerTwo.getAllTheUser());
    }
}
