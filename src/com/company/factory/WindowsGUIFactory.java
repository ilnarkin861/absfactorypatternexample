package com.company.factory;

import com.company.interfaces.GUIFactory;
import com.company.interfaces.IButton;
import com.company.interfaces.ICheckbox;
import com.company.windows.WindowsButton;
import com.company.windows.WindowsCheckbox;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public IButton drawButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox drawCheckBox() {
        return new WindowsCheckbox();
    }
}
