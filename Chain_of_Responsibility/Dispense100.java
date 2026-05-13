public class Dispense100 extends DispenseChain {
    public void dispense(int amount) {
        if (amount >= 100) {
            int num = amount / 100;
            int rem = amount % 100;
            System.out.println("100 notes: " + num);

            if (rem != 0) next.dispense(rem);
        } else {
            next.dispense(amount);
        }
    }
    
}
