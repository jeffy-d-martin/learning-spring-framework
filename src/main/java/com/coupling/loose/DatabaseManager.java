package com.coupling.loose;

import com.coupling.tight.MySqlDatabase;

public class DatabaseManager {

    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    public String getAllTheUser(){
        return database.getUser();
    }
}
