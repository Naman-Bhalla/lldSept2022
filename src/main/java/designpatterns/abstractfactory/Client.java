package designpatterns.abstractfactory;

import designpatterns.abstractfactory.components.buttons.Button;
import designpatterns.abstractfactory.components.menus.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
    }
}
