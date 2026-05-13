public class Dispense500 extends DispenseChain {
    public void dispense(int amount) {
        if (amount >= 500) {
            int num = amount / 500;
            int rem = amount % 500;
            System.out.println("500 notes: " + num);

            if (rem != 0) next.dispense(rem);
        } else {
            next.dispense(amount);
        }
    }
    
}
