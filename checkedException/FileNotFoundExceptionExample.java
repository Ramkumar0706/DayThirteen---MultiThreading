package checkedException;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;  
public class FileNotFoundExceptionExample {  
    public static void main(String[] args) { 
    	
        try {  
            File file = new File("f/ile.txt");  
            Scanner scanner =new Scanner(file);  
        } catch (FileNotFoundException e) {  
            System.out.println("File not found: " + e.getMessage());  
        }  
        
        finally {
        	System.out.println("finally block is exceted");
		}
    }  
}  