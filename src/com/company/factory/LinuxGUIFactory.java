package com.company.factory;

import com.company.interfaces.GUIFactory;
import com.company.interfaces.IButton;
import com.company.interfaces.ICheckbox;
import com.company.linux.LinuxButton;
import com.company.linux.LinuxCheckbox;

public class LinuxGUIFactory implements GUIFactory {
    @Override
    public IButton drawButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckbox drawCheckBox() {
        return new LinuxCheckbox();
    }
}
