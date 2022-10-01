package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.Button;
import designpatterns.abstractfactory.components.dropdowns.DropDown;
import designpatterns.abstractfactory.components.menus.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();
    public DropDown createDropdown();
}
