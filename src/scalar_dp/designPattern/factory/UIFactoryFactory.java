package scalar_dp.designPattern.factory;

import scalar_dp.designPattern.factory.components.menu.AndroidMenu;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform platform) {
        return switch (platform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
        };
    }
}
