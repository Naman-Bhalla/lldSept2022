package designpatterns.abstractfactory;

// practical factory
public class UiFactoryFactory {

    public static UIFactory getUiFactoryForPlatform(SupportedPlatforms platform) {
        return switch (platform) {
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
