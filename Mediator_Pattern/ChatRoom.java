class ChatRoom implements Mediator {
    public void send(String msg, User sender) {
        System.out.println(sender.getName() + ": " + msg);
    }
}
