import java.io.Serializable;
public class Account implements Serializable{
   private int ano;
   private String title;
   private double balance;
   transient int pinNo;
   public Account(int a,String t,double b,int p){
	ano=a;
	title=t;
	balance=b;
	pinNo=p;
   }
   public int getAno(){
	return ano;
   }
   public String getTitle(){
	return title;
   }
   public void setTitle(String t){
	title=t;
   }
   public double getBalance(){
	return balance;
   }
   public int getPinNo(){
	return pinNo;
   }
   public void deposit(double amt){
	balance+=amt;
	System.out.println("Balance after deposit is "+balance);
   }
   public void withdraw(double amt){
	if ((balance-amt)>=0){
	    balance-=amt;
	    System.out.println("Balance after withdrawl is "+balance);
	}else
	    System.out.println("Sorry no funds");
    }
}