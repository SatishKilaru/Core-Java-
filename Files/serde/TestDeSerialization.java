import java.io.*;
public class TestDeSerialization{
    public static void main(String[] args){
	File file=null;
	ObjectInputStream ois=null;
	FileInputStream fis=null;
	Account a;
	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	    //create Stream objects
	    fis=new FileInputStream(file);
	    ois=new ObjectInputStream(fis);
	
	   //read object
	     a=(Account)ois.readObject();

	   //print
	    String t=a.getTitle();
	    double b=a.getBalance();
	    int p=a.getPinNo();
	
	    System.out.println(t);
	    System.out.println(b);
	    System.out.println(p);


	}catch(Exception fe){
		fe.printStackTrace();
	}
    }
}