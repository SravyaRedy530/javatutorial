import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name;
        System.out.print("Enter your name: ");
        name=scanner.nextLine();
        int age;
        System.out.print("Enter your age: ");
        age=scanner.nextInt();
        boolean isStudent;
        System.out.print("Are you a student (true/false): ");
        isStudent=scanner.nextBoolean();

        //group1

        if(age >= 18){
            System.out.println("You are an adult");
        }
        if(age >= 75){
            System.out.println("You are a senior");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet");
        }
        else if(age == 0){
            System.out.println("You are a baby");
        }
        else{
            System.out.println("You are a child");
        }
        //group2
        if(name.isEmpty()){
            System.out.println("You didn't enter your name");
        }
        else{
            System.out.println("Hello " + name + "!");
        }
        
        //group3
        if(isStudent){
        System.out.println("You are a student");
        }else{
        System.out.println("You are NOT a student");
        }

        scanner.close();
        }
        }
    

        
        