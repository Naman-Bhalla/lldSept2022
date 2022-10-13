package casestudies.pen.writestrategies;

public class SmoothWriteStrategy implements WriteStrategy {

    @Override
    public void write() {
        System.out.println("Writing smoothly");
    }
}
