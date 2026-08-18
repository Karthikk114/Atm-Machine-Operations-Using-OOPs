package com.mycompany.atm_machine;

import java.util.*;

public class ATM_SERVICEIMPL implements ATM_SERVICE {
    int status=-1;
    ATM_DTO obj=new ATM_DTO();
    Map<Double,String>dp=new HashMap<>();
    public void view_balance() {
        System.out.println(" Your balance is : "+obj.getBalance());
    }
    public void Deposite(double amount) {
        System.out.println("Amount is deposite successfully");
       obj.setBalance(obj.getBalance()+amount);
       System.out.println("BALANCE AMOUNT:"+obj.getBalance());
       dp.put(amount,"Amount is desposite");
    }
    public void Withdraw(double withdraw) {
        if(withdraw<=obj.getBalance()){
            System.out.println("Withdraw amount is:"+withdraw);
            obj.setBalance(obj.getBalance()-withdraw);
            System.out.println("Remaining balance is:"+obj.getBalance());
            dp.put(withdraw,"Amount is withdraw");
        }
    }
    public void stop(){
        System.out.println("Thanks for visting to ATM");
        
    }
    public void Mini_Statement(){
        for(Map.Entry<Double,String> entry:dp.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        
    }
    
}
