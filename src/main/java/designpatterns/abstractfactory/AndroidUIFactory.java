package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.AndroidButton;
import designpatterns.abstractfactory.components.buttons.Button;
import designpatterns.abstractfactory.components.dropdowns.AndroidDropDown;
import designpatterns.abstractfactory.components.dropdowns.DropDown;
import designpatterns.abstractfactory.components.menus.AndroidMenu;
import designpatterns.abstractfactory.components.menus.Menu;
import overloading.A;

public class AndroidUIFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropDown createDropdown() {
        return new AndroidDropDown();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
