package casestudies.pen.pens;

import casestudies.pen.Refil;

import java.sql.Ref;

public class BallPen extends Pen {
    private Refil refil;

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
