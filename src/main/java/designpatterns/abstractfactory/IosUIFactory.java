package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.Button;
import designpatterns.abstractfactory.components.buttons.IosButton;
import designpatterns.abstractfactory.components.dropdowns.DropDown;
import designpatterns.abstractfactory.components.dropdowns.IosDropDown;
import designpatterns.abstractfactory.components.menus.IosMenu;
import designpatterns.abstractfactory.components.menus.Menu;

public class IosUIFactory implements UIFactory {

    @Override
    public DropDown createDropdown() {
        return new IosDropDown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
