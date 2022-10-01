package designpatterns.decorator;

public class ChocolateCone implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocolateCone() {}

    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }

    @Override
    public int getCost() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getCost() + 30;
        }
        return 30;
    }
}
