package scalar_dp.designPattern.factory;

import scalar_dp.designPattern.factory.components.button.AndroidButton;
import scalar_dp.designPattern.factory.components.button.IosButton;
import scalar_dp.designPattern.factory.components.dropdown.AndroidDropDown;
import scalar_dp.designPattern.factory.components.dropdown.IosDropDown;
import scalar_dp.designPattern.factory.components.menu.AndroidMenu;
import scalar_dp.designPattern.factory.components.menu.IosMenu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosDropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
