import java.io.*;
public class TestSerialization{
    public static void main(String[] args){
	File file=null;
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	Account act=null;
	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	   //create Stream objects
	   fos=new FileOutputStream(file);
	   oos=new ObjectOutputStream(fos);

	   //create object
	   act=new Account(1001,"NK",50000,2324);
	   
	 //serialize
	   oos.writeObject(act);
	
	   System.out.println("Sucessfully serialized");

	   oos.flush();

	   oos.close();
	

	}catch(Exception fe){
		fe.printStackTrace();
	}
    }
}