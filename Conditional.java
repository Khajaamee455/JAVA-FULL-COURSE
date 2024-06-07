import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        int password ;

        System.out.println("Enter your password :");
        Scanner sc = new Scanner(System.in);
        password = sc.nextInt();

        if(password == 4549){
            System.out.println("welcome to course ...");
         }
        else if(password == 7860){
        System.out.println("This is also a valid password ");
        }
        else{
            System.out.println("Wrong password...try again");
        }
    
}
}
