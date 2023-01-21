package scalar_dp.designPattern.factory;

import scalar_dp.designPattern.factory.components.button.Button;
import scalar_dp.designPattern.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory factory = flutter.createUIFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
    }
}
