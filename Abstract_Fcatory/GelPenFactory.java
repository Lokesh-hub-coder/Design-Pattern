package Abstract_Fcatory;



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
