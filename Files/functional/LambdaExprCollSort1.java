import java.util.*;
public class LambdaExprCollSort1{
    public static void main(String[] args){

		List<String> list = new ArrayList<>();
   		list.add("Vizag"); 
       list.add("Amaravati");  
       list.add("Chennai");  
       list.add("Bangalore");  
       list.add("Bhubaneswar");  
 		list.add("Mangalore"); 

		//sorting
		Collections.sort(list, (String a, String b) -> {
    			return a.compareTo(b);
		});

		System.out.println(list); 

   }
}