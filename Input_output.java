import java.util.Scanner;
public class Input_output {
    /*
     * In java we can take user input using this ...
     * 
     * Scanner sc = new Scanner(System.in);
     * 
     * Here Scanner is class present in java util package which is use to take an user input
     * sc - is a object reference using this we can specify which type of input we are taking 
     *  like - numbers , strings , double values like that
     * 
     * new - is keyword for memory allocation 
     * System.in - taking input 
     */
    public static void main(String[] args) {
        String name ;
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
    
       name = sc.nextLine();// means we are taking string type of intput
        
       System.out.println("Welcome :"+name);         // this is output 
        
    }

}
