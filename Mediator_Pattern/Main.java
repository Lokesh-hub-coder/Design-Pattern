public class Main {
    public static void main(String[] args) {
        Mediator chat = new ChatRoom();

        User u1 = new User(chat, "Lokesh");
        User u2 = new User(chat, "Aman");

        u1.send("Hello");
        u2.send("Hi bro");
    }
}
