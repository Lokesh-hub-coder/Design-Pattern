public class Door {
    private DoorState state;

    public Door(DoorState state) {
        this.state = state;
    }

    public void setState(DoorState state) {
        this.state = state;
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }
}

