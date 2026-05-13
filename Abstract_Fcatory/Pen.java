package Abstract_Fcatory;

class Pen {

    private Tube tube;
    private Refill refill;

    Pen(Tube tube, Refill refill) {
        this.tube = tube;
        this.refill = refill;
    }

    void showPenDetails() {
        tube.tubeType();
        refill.refillType();
    }
}