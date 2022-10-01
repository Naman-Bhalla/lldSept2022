package designpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents =
                new ChocoChips(
                    new VanillaScoop(
                            new StrawberryScoop(
                                    new ChocoChips(
                                            new ChocolateCone(
                                                new ChocolateCone(
                                                        new OrangeCone()
                                                )
                                            )
                                    )
                            )
                    )
                );

        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());

        // Text t = new Text("Hello World");
        // t.setFontSize(20);
        // Paragraph p = new Paragraph(t);
        // p.setMargin(1.5 rem);
        // Body b = new Body(p);
        // class Body {
        //  private List<HTMLElement> htmlEleements;
        //  public Body(List<HTMLELement>) {
        //
        //  }
        // }

        // b.display() -> p.display() -> t.display()
    }
}
