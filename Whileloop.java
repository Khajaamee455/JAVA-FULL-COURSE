import java.util.Scanner;

public class Whileloop {
    
    public static void main(String args[]){
        int number ;
      System.out.println("Enter any number :");

      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();

      while (number >= 0) {

        if(number % 2 == 0){
            System.out.println("This is even number you entered here");
            break;
        }
        else{
            System.out.println("This is odd number ..");
            break;
        }
        
      }

    }
}
