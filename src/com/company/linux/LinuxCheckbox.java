package com.company.linux;

import com.company.interfaces.ICheckbox;

public class LinuxCheckbox implements ICheckbox {
    @Override
    public void draw() {
        System.out.println("Draw LinuxCheckbox");
    }
}
