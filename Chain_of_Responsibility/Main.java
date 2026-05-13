public class Main {
    public static void main(String[] args) {
        DispenseChain c1 = new Dispense2000();
        DispenseChain c2 = new Dispense500();
        DispenseChain c3 = new Dispense100();

        c1.setNext(c2);
        c2.setNext(c3);

        int amount = 4600;
        System.out.println("Dispensing amount: " + amount);
        c1.dispense(amount);
    }
}
