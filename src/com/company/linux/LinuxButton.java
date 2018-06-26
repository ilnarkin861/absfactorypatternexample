package com.company.linux;

import com.company.interfaces.IButton;

public class LinuxButton implements IButton {
    @Override
    public void draw() {
        System.out.println("Draw LinuxButton");
    }
}
