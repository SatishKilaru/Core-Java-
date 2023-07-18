import java.util.*;
class Account{
    private int ano;
    private String title;
    private double balance;
    public Account(int a,String t,double b){
			ano=a;
			title=t;
			balance=b;  
    }
    public int getAno(){
		return ano;
    }
     public void setTitle(String t){
		title=t;
     }
     public String getTitle(){
		return title;
     }
     public double getBalance(){
		return balance;
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
	   	   System.out.println("Sorry insufficient funds");
     }
}


public class LambdaExprCollSort2{
    public static void main(String[] args){

		//Create collecton
		ArrayList<Account> al=new ArrayList<>();
	
 		//adding elements
		al.add(new Account(101,"NS",50000));
		al.add(new Account(102,"NX",65000));
		al.add(new Account(103,"NK",31000));
	
		//sorting
		Collections.sort(al,(a1,a2)->{  
        	return a1.getTitle().compareTo(a2.getTitle());  
        });

		//reading collection
		Iterator<Account> itr=al.iterator();
	
		//readinng elements
		Account a;
		while(itr.hasNext()){
	   	     a=itr.next();
	    	 System.out.println(a.getTitle());
		}
   }
}