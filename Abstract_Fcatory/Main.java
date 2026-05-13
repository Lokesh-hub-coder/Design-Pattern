abstract class PenFactory {

    abstract Tube createTube();
    abstract Refill createRefill();

    // Factory method to create Pen
    Pen getPen() {
        return new Pen(createTube(), createRefill());
    }
}

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

class GelPenFactory extends PenFactory {

    @Override
    Tube createTube() {
        return new MetalTube();
    }

    @Override
    Refill createRefill() {
        return new PlasticRefill();
    }
}

abstract class Tube {
    abstract void tubeType();
}

abstract class Refill {
    abstract void refillType();
}


class MetalTube extends Tube {
    @Override
    void tubeType() {
        System.out.println("Metal Tube");
    }
}

class FiberTube extends Tube {
    @Override
    void tubeType() {
        System.out.println("Fiber Tube");
    }
}

class PlasticRefill extends Refill {
    @Override
    void refillType() {
        System.out.println("Plastic Refill");
    }
}

class SpongeRefill extends Refill {
    @Override
    void refillType() {
        System.out.println("Sponge Refill");
    }
}


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
public class Main {
    public static void main(String[] args) {

        PenFactory sketchFactory = new SketchPenFactory();
        Pen sketchPen = sketchFactory.getPen();
        sketchPen.showPenDetails();

        System.out.println();

        PenFactory gelFactory = new GelPenFactory();
        Pen gelPen = gelFactory.getPen();
        gelPen.showPenDetails();
    }
}