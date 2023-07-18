import java.io.*;
public class FileReadingBS{
    public static void main(String[] args){

	File file=null;
	BufferedInputStream bis=null;
	FileInputStream fis=null;
	int b;

	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	   //check the given input is a file
	   if (file.isFile()){

		//create Stream objects
		fis=new FileInputStream(file);
		bis=new BufferedInputStream(fis);
	
	        //reading from file byte by byte
		while((b=bis.read())!=0) {
		    System.out.print((char)b);
		}
	  	
	   }else{
		System.out.println("Sorry given input is not a file");
	   }
	   //   
	   file=null;

	}catch(Exception fe){
		fe.printStackTrace();
	}
    }
}