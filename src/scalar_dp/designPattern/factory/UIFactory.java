package scalar_dp.designPattern.factory;

import scalar_dp.designPattern.factory.components.button.Button;
import scalar_dp.designPattern.factory.components.dropdown.Dropdown;
import scalar_dp.designPattern.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropDown();
}
