package clases;

public class Bank_Account {
    /**
     * Representa una cuenta bancaria con su numero y estado
     * @Author: SANTIAGO
     */
    private int accountNumber;
    protected boolean activated;



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Bank_Account(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "Bank_Account{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
        public void statusAccount(boolean status) {
        if (status)
            System.out.println("The account is active");
        else
            System.out.println("Account is inactive");
    }
}
