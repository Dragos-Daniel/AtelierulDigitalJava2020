package proiect_final_java.prob2_ChainOfResponsability;

public class Disp10 implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain next) {
        this.chain = next;
    }

    @Override
    public void dispense(Currency curr) {
        if(curr.getAmount() >= 10){
            int nr = curr.getAmount() / 10;
            int rest = curr.getAmount() % 10;
            System.out.println("Se Elibereaza " + nr + " bancnote de 10 lei");
            if (rest != 0)
                this.chain.dispense(new Currency(rest));
        }
        else
            this.chain.dispense(curr);
    }
}
