package clases;
/**
 * Representa una cuenta bancaria con su numero y estado
 * @Author: SANTIAGO
 */
public class BankAccount {

    private int accountNumber;
    protected boolean activated;

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }

    /**
     * se verifica el estado de la cuenta que anda en memoria en el momento
     * @param status
     */
    public void statusAccount(boolean status) {
        if (status) System.out.println("The account is active");
        else System.out.println("Account is inactive");
    }

}
