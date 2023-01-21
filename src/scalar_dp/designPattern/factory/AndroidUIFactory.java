package scalar_dp.designPattern.factory;

import scalar_dp.designPattern.factory.components.button.AndroidButton;
import scalar_dp.designPattern.factory.components.dropdown.AndroidDropDown;
import scalar_dp.designPattern.factory.components.menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
