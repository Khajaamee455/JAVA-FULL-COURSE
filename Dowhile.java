import java.util.Scanner;

public class Dowhile {
    
    public static void main(String[] args) {
        int number ;
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        do {
            System.out.println("Hello ...");
            
        } while ( number == 0);
    }
}
