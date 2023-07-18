import java.io.*;
public class FileWritingWithDOS{
    public static void main(String[] args){
	File file=null;
	DataOutputStream dos=null;
	BufferedOutputStream bos=null;
	FileOutputStream fos=null;
	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	   //create Stream objects
	   fos=new FileOutputStream(file);
	   bos=new BufferedOutputStream(fos);
	   dos=new DataOutputStream(bos);

	    //writing primitives
	   int x=100;
	   boolean b=false;
	   double d=43.53;
	   char c='Z';
	   
           //writing  now
 	   dos.writeInt(x);
	   dos.writeBoolean(b);
	   dos.writeDouble(d);
	   dos.writeChar(c);

	   dos.flush();

	   dos.close();
	

	}catch(Exception fe){
		fe.printStackTrace();
	}
    }
}