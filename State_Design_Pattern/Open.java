public class Open implements DoorState{

    @Override
    public void open() {
        System.out.println("Door is already open");
    }

    @Override
    public void close() {
        System.out.println("Closing the door...");
    }
    
}
