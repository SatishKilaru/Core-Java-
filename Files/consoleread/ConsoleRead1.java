public class ConsoleRead1{
    public static void main(String[] args){      
  
        // Using Console to input user name
        System.out.println("Enter Your User name");

        String name = System.console().readLine();

        // Using Console to input pwd
        System.out.println("Enter Your Pwd");

        char[] pwd = System.console().readPassword();
		 String pwds=new String(pwd);

        System.out.println("You entered the Name: " +name);
        System.out.println("You entered the Pwd: " +pwds);
    }
}