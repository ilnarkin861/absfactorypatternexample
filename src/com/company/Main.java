package com.company;

public class Main {

    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        App app = new App(os);
        app.drawElements();
    }
}
