package Abstract_Fcatory;

abstract class PenFactory {

    abstract Tube createTube();
    abstract Refill createRefill();

    // Factory method to create Pen
    Pen getPen() {
        return new Pen(createTube(), createRefill());
    }
}
