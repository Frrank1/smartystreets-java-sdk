package com.smartystreets.api;

public enum GeolocateType {
    CITY("city"), STATE("state"), NONE("null");

    private final String name;

    GeolocateType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
