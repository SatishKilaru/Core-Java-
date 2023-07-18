import java.util.*;  
public class LambdaExprForEach{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
   		 list.add("Vizag"); 
        list.add("Amaravati");  
        list.add("Chennai");  
        list.add("Bangalore");  
        list.add("Bhubaneswar");  
 		 list.add("Mangalore"); 
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  