package com.example.utils;

import java.util.Properties;

public enum ApplicationProperties {
    INSTANCE;
    Properties properties;

    ApplicationProperties(){
        properties=new Properties();
        try{
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getUrl(){
        return properties.getProperty("url");
    }
    public String getName(){return properties.getProperty("Username");}
    public String getPassword(){return properties.getProperty("Password");}



}
