import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Enter the name: ");
         String name = scanner.nextLine();
    
         System.out.println("Hello " + name);
    
        scanner.close();
    }
    }

