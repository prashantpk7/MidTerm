/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;
/**
 *
 * @author Sivagama
 */
public class AccountTester {
    
    public static void main(String[] args) {
        /*here assumed that 500 accounts can be created
        for the given bank*/
        Account ac[]=new Account[500];
        double bal=0;
        int y=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the amount(in dollars) by which you want to open an account(more than 50$):");
        bal=sc.nextDouble();       
        while(y==0){       
        if(bal>50){
           y=1;
           break;
        }
        else{
            System.out.println("Please enter the amount(in dollars) by which you want to open an account(more than 50$):");
            bal=sc.nextDouble();
            y=0;
        }
        }
        
        System.out.println("Please enter the unique user name:");
        sc.nextLine();
        String user= sc.nextLine();
        
        Account a=new Account(bal,user);
        ac[0]=a;
             
        System.out.println("The balance is: "+a.getBalance());  
        System.out.println("The InterestRate per month is "+a.getInterestRate());
        System.out.println("The final balance is "+a.getFinalBalance()  );
    }
}
