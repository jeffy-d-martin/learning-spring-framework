package com.couplingusingspring.coupling.loose;

public class MySqlDatabase implements Database {

    @Override
    public String getUser(){
        return "fetching the all the user from the mySql database";
    }

}
