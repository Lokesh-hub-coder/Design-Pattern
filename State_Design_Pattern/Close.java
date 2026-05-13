public class Close implements DoorState{
    @Override
    public void open() {
        System.out.println("Door is opening...");
    }

    @Override
    public void close() {
        System.out.println("Door is already closed.");
    }
    
}
