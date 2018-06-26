package com.company.windows;

import com.company.interfaces.IButton;

public class WindowsButton implements IButton {
    @Override
    public void draw() {
        System.out.println("Draw WindowsButton");
    }
}
