public class Main {
    public static void main(String[] args) {
        PaymentStrategy card = new Card();
        card.pay();

        PaymentStrategy upi = new UPI();
        upi.pay();
    }
}
