package generics;

public class GeneriMetod {
		  
		   public static < E > void printArray(E[] elements) {  
		        for ( E element : elements){          
		            System.out.println(element );  
		         }  
		         System.out.println();  
		    }  
		    public static void main( String args[] ) {  
		        Integer[] intArray = { 10, 20, 30, 40, 50 };  
		        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' }; 
		        float[] floatArray= {1.23f,5.3f,9.3f,8.1f,9.2f};
		  
		        System.out.println( "Printing Integer Array" );  
		        printArray( intArray  );   
		  
		       System.out.println( "Printing Character Array" );  
		        printArray( charArray );   
		        
//		        System.out.println( "Printing float Array" );  
//		        printArray( floatArray );   
		    }   
		}  

