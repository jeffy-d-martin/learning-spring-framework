package com.couplingusingspring.coupling.tight;

public class DatabaseManager {
    private MySqlDatabase mySqlDatabase;

    public DatabaseManager(MySqlDatabase mySqlDatabase) {
        this.mySqlDatabase = mySqlDatabase;
    }

    public String getAllTheUser(){
        return mySqlDatabase.getAllUser();
    }
}
