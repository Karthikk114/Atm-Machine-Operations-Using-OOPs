package com.mycompany.atm_machine;
public interface ATM_SERVICE {
    public void view_balance();
    public void Deposite(double amount);
    public void Withdraw(double withdraw);
    public void Mini_Statement();
    public void stop();  
}
