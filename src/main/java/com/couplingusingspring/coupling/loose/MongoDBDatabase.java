package com.couplingusingspring.coupling.loose;

public class MongoDBDatabase implements Database {

    @Override
    public String getUser() {
        return "fetching the all the user from the MongoDB Database";
    }
}
