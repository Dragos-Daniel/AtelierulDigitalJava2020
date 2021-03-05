package proiect_final_java.prob2_ChainOfResponsability;

public interface DispenseChain {
    void setNextChain(DispenseChain next);
    void dispense (Currency curr);
}
