public class LambdaExprFI1 {  
    public static void main(String[] args) {  
 
        //with lambda  
        Runnable r=()->{  
            for(int i=1;i<100;i++)
				System.out.println(i);  
        };  
        Thread t=new Thread(r);
		 t.start(); 
    }  
}  