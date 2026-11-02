package com.coupling.tight;

public class DatabaseManager {
    private MySqlDatabase mySqlDatabase = new MySqlDatabase();

    public String getAllTheUser(){
        return mySqlDatabase.getAllUser();
    }
}
