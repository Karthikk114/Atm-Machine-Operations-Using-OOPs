package com.mycompany.atm_machine;

import java.util.Scanner;

public class ATM_MACHINE {
    static int username=123;
    static int password=123;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO ATM MACHINE");
        System.out.println("ENTER THE USERID :");
        int user=input.nextInt();
        System.out.print("ENTER THE PASSWORD :");
        int pass=input.nextInt();
        ATM_SERVICEIMPL obj1=new ATM_SERVICEIMPL();
        
        if(user==username && password==pass){
            int status=0;
            while(status==0){
                System.out.print(" 1.View Balance \n 2.Deposite Amount\n 3.Withdraw Amount \n 4.Mini Statement \n 5.Stop \n ");
               int value=input.nextInt();
               if(value==1){
                   obj1.view_balance();
               }else if(value==2){
                   System.out.print("Enter the Depostie amount :");
                   double amount=input.nextDouble();
                   obj1.Deposite(amount);
               }else if(value==3){
                   System.out.print("Enter the withdraw amount:");
                   double Withdraw_amount=input.nextInt();
                   obj1.Withdraw(Withdraw_amount);
               }else if(value==4){
                   obj1.Mini_Statement();
               }else {
                   obj1.stop();
                   status=-1;
               }
                
            }

        }else{
            System.out.print("Enter the correct details");
        }
    }
}
