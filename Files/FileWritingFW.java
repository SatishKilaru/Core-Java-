import java.io.*;
public class FileWritingFW{
    public static void main(String[] args){
	File file=null;
	BufferedWriter bw=null;
	FileWriter fw=null;
	String line;
	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	   //create Stream objects
	   fw=new FileWriter(file);
	   bw=new BufferedWriter(fw);
	
	   bw.write("Iam from Pennant");

	   bw.write("My name is Mahesh");

	   bw.flush();

	   bw.close();
	

	}catch(Exception fe){
		fe.printStackTrace();
	}
    }
}