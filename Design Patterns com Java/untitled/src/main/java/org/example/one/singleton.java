package org.example.one;

public class singleton {
    private static singleton instance;
    private singleton() {
        super();
    }
    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    }

