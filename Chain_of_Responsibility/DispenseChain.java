abstract class DispenseChain {
    protected DispenseChain next;

    public void setNext(DispenseChain next) {
        this.next = next;
    }

    public abstract void dispense(int amount);
}