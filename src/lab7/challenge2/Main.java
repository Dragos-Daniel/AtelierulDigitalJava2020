package lab7.challenge2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1= new BankAccount("Account 1", 2000);
        BankAccount ba2= new BankAccount("Account 2", 4000);
        BankAccount ba3= new BankAccount("Account 3", 2500);

        TransactionThread tt1 = new TransactionThread("Transaction 1", ba1, ba2, 1000);
        TransactionThread tt2 = new TransactionThread("Transaction 2", ba1, ba3, 1900);

        tt1.start();
        tt2.start();
    }
}
