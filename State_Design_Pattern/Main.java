public class Main {
    public static void main(String[] args) {

        Door door = new Door(new Close());

        door.open(); // opens

        door.setState(new Locked());
        door.open(); // cannot open

        door.setState(new Open());
        door.close(); // closes
    }
}
