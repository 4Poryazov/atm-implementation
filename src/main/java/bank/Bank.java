package bank;

public interface Bank {

    boolean checkDebitCardPassword();
     void createBankAccount();
     void depositMoneyToAccount();

     void setWithdrawLimits();
     double viewCurrentLimit();

     void createDebitCard();
     void blockDebitCard();



}
