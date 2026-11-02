package com.coupling.tight;

public class TightCoupling {
    static void main() {
        DatabaseManager databaseManager = new DatabaseManager();

        System.out.println(databaseManager.getAllTheUser());
    }
}
