interface Transaction{
	public void deposit(double amt);
}
public class LambdaExprFI2 {  
    public static void main(String[] args) {  
 
        //with lambda  
        Transaction t=(amt)->{  
				System.out.println("Calls automatically deposit method"); 
				System.out.println("Depositing Amount :"+amt);  
        };  
		 t.deposit(23000); 
    }  
}  