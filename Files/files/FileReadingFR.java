import java.io.*;
public class FileReadingFR{
    public static void main(String[] args){
	File file=null;
	BufferedReader br=null;
	FileReader fr=null;
	String line;
	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	   //check the given input is a file
	   if (file.isFile()){
		//create Stream objects
		fr=new FileReader(file);
		br=new BufferedReader(fr);
	
	        //reading from file line by line
		while((line=br.readLine())!=null){
		    System.out.println(line);
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