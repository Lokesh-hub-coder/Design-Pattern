class Locked implements DoorState {

    public void open() {
        System.out.println("Cannot open, door is locked");
    }

    public void close() {
        System.out.println("Door is locked");
    }
}