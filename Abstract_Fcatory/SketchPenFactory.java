package Abstract_Fcatory;

class SketchPenFactory extends PenFactory {

    @Override
    Tube createTube() {
        return new FiberTube();
    }

    @Override
    Refill createRefill() {
        return new SpongeRefill();
    }
}
