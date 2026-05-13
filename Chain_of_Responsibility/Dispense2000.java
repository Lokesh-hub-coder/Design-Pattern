class Dispense2000 extends DispenseChain {
    public void dispense(int amount) {
        if (amount >= 2000) {
            int num = amount / 2000;
            int rem = amount % 2000;
            System.out.println("2000 notes: " + num);

            if (rem != 0) next.dispense(rem);
        } else {
            next.dispense(amount);
        }
    }
}
