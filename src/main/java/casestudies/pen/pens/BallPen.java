package casestudies.pen.pens;

import casestudies.pen.Refil;
import casestudies.pen.writestrategies.SmoothWriteStrategy;
import casestudies.pen.writestrategies.WriteStrategy;

public class BallPen extends Pen {
    private Refil refil;

    public BallPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    public Refil getRefil() {
        return refil;
    }

    public void setRefil(Refil refil) {
        this.refil = refil;
    }

    @Override
    public void write() {

    }
}
