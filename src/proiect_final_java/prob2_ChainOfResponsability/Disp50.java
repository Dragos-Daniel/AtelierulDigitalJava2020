package proiect_final_java.prob2_ChainOfResponsability;

public class Disp50 implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain next) {
        this.chain = next;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount() >= 50){
            int nr = curr.getAmount() / 50;
            int rest = curr.getAmount() % 50;
            System.out.println("Se Elibereaza " + nr + " bancnote de 50 lei");
            if (rest != 0)
                this.chain.dispense(new Currency(rest));
        }
        else
            this.chain.dispense(curr);
    }
}
