package lab7.challenge2;

public class BankAccount extends Thread {
    private String name;
    private double debit;

    public BankAccount(String name, double debit){
        this.name = name;
        this.debit = debit;
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if(debit >= amount) {
            debit = debit-amount;
            System.out.println("New amount after withdraw: " + debit);
        }
        else{
            throw new InsufficientFundsException();
        }
    }

    public synchronized void deposit(double amount){
        longDatabaseCall();
        debit+=amount;
        System.out.println("New amount after deposit: " + debit);
    }

    private void longDatabaseCall() {
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
