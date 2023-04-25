import java.util.Scanner;
public class Second {
 // java program to check voting eligibility
   public static void main(String[] args) {
    // user input Scanner class 
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your Age::::");
    int age=sc.nextInt();
    if(age>=18)
    {
    System.out.println(":::::::ELIGIBLE FOR VOTE::::::");
    }
    else
    {
    System.out.println(":::::::NOT ELIGIBLE FOR VOTE:::::::");
    }
    
   } 
}
