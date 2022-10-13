package casestudies.pen;

import casestudies.pen.pens.BallPen;
import casestudies.pen.pens.Pen;
import casestudies.pen.writestrategies.SmoothWriteStrategy;

public class Main {
    public static void main(String[] args) {
        Pen reynoldsTrimax = new BallPen(new SmoothWriteStrategy());

    }
}

// Client -> Pen.write() -> WriteSTrategy,writeBehaviou()