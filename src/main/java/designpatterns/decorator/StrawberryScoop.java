package designpatterns.decorator;

public class StrawberryScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Strawberry Scoop";
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 15;
    }
}
