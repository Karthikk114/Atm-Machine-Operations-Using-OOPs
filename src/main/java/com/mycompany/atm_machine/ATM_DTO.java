package com.mycompany.atm_machine;
public class ATM_DTO {
    private double Balance;
    private double deposite;
    public ATM_DTO(){}

    public ATM_DTO(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }
    public void setBalance(double Balance) {
        this.Balance=Balance;
    }
    public double getDeposite() {
        return deposite;
    }
    public void setDeposite(double deposite) {
        if(deposite>0) {
            this.deposite = deposite;
        }
    }
}
