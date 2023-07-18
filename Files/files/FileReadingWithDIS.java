import java.io.*;
public class FileReadingWithDIS{
    public static void main(String[] args){
	File file=null;
	DataInputStream dis=null;
	BufferedInputStream bis=null;
	FileInputStream fis=null;
	int b;
	try{
	   
	   //creating the file object
	   file=new File("sample2.txt");

	    //create Stream objects
	    fis=new FileInputStream(file);
	    bis=new BufferedInputStream(fis);
	    dis=new DataInputStream(bis);
	
	    //readng primitive data
	    int i;
	    boolean f;
	    double d;
	    char x;
	    i=dis.readInt();
	    f=dis.readBoolean();
	    d=dis.readDouble();
	    x=dis.readChar();

	    //printing
	    System.out.println(i);
	    System.out.println(f);
	    System.out.println(d);
	    System.out.println(x);	

	}catch(Exception fe){
		fe.printStackTrace();
	}
    }
}