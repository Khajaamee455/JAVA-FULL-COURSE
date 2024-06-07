public class Constructors {

    int a , b;
    //Constructor is a special type of method it have same name of class 
    // There are 4 types of constructor 
    //1) Default constructor - dont have any parameter
    // 2 ) parameterized constructor - have more than one parameters
    //3) private constructor - having private keyword 
    // 4 ) copy constructor

    Constructors(){
        // this is defulat constructor
    }

    Constructors(int a , int b){
        // this is parameterized constructor 
      this.a = a ;
      this.b = b;

      // this is keyword it refers to the current object ..
    }

    public void calculate(){
        int c ;
        c = a + b;
        System.out.println("Sum of two numbers :"+c);
    }

    public static void main(String[] args) {
    
        Constructors con = new Constructors(100 , 200); 
        con.calculate();    
    }

    
}
