package Exception_handling;
import java.io.*;  

public class Throws_Testing {
	
	
	  
	     
	    public static void method() throws FileNotFoundException {  
	  
	        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");  
	        BufferedReader fileInput = new BufferedReader(file);  
	  
	      
	        throw new FileNotFoundException();  
	      
	    }  

	public static void main(String[] args) {
		try
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error : "+e);
		}

	}

}
