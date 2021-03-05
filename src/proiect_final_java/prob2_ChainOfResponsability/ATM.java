package proiect_final_java.prob2_ChainOfResponsability;

import java.util.Scanner;

public class ATM {
    private DispenseChain c1;
    public ATM(){
        this.c1 = new Disp50();
        DispenseChain c2 = new Disp20();
        DispenseChain c3 = new Disp10();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATM bancomat = new ATM();
        while(true){
            int amount = 0;
            System.out.println("Introduceti suma dorita: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 10 != 0 ){
                System.out.println("Suma trebuie sa fie multiplu de 10!");
                return;
            }
            bancomat.c1.dispense(new Currency(amount));
        }
    }
}
