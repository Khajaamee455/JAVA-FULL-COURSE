public class Variables {

     static int d = 500 ;                // this is static variable
    int a = 100 ;                        // this is instance variable 
    // here a= variable 
    // int = datatype 
    // 100 = value stored on variable a 

    /* there are 4 types of variables in java 
        1) local variable - local variables are the variables we can declare this variables 
                            within block of code ex: within methods or in main mathod..
     *  2) Instance variable - these are class level variables we can declare this variables within the class
     *                      if we want to access this variables we have to create an object of the class and then we can access them 
     * 
     *  3) Static variable - these variable contains static keyword infront of them and we dont need to create an object to access these 
     * 
     *  4) final variables - these variable conatains final keyword infront of them and we cannot chenge the value of final variable once we assign to it .
     */
    
     public static void main(String[] args) {
        int b = 200;  // this is local variable 

        boolean c = true ;       // this is also local variable

        Variables v = new Variables();      // this is how we create an object of class and calling the instance variable with object refrence
        System.out.println(v.a);  // like this 
        System.out.println(d); // dont want to create an object to access it 
        System.out.println(b);
        System.out.println(c);
     }
}
