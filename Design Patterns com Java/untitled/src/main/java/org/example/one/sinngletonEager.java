package org.example.one;

public class sinngletonEager {
    private static sinngletonEager instance =new sinngletonEager();
    private sinngletonEager() {
        super();
    }
    public static sinngletonEager getInstance() {
        return instance;
    }

}

