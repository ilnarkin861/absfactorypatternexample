package com.company;


import com.company.factory.*;

public class App {

    private String os;

    public App(String os) {
        this.os = os;

    }

    public void drawElements() {
        if(os.toLowerCase().contains("linux")){
            LinuxGUIFactory linuxGuiFactory = new LinuxGUIFactory();
            linuxGuiFactory.drawButton().draw();
            linuxGuiFactory.drawCheckBox().draw();
        }

        if(os.toLowerCase().contains("windows")){
            WindowsGUIFactory linuxGuiFactory = new WindowsGUIFactory();
            linuxGuiFactory.drawButton().draw();
            linuxGuiFactory.drawCheckBox().draw();
        }

        //..........
    }
}
