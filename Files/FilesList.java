import java.io.*;
public class FilesList{
    public static void main(String[] args){
		File file=null;
		File[] subfiles;
	
	try{
	   
	   //creating the file object
	   file=new File(args[0]);

	   //check the given input is a file or folder
	   if (file.isDirectory()){
	  	  //read subfolders and files
		  subfiles =file.listFiles();

		  System.out.println("Sub Folders / Files under the given Folder");
		  //iterate through subfiles
	     for(File f : subfiles){
		  	   //check f is file or folder
		      if (f.isFile()){
					System.out.println("------------------ "+ f.getName());
		      }else{
					System.out.println(f.getName());
		      }
		  }
	   }else{
			System.out.println("Sorry given input is not a folder");
	   }
	   //   
	   file=null;

	}catch(Exception fe){
		fe.printStackTrace();
	}
  }
}