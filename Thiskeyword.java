public class Thiskeyword {

    int a;
    // this keyword referce to the current object
    //why we use - when ever the name of local variabl and instance variable are same
    //then our runtime envinornament JVM get confuse which one is local and which one is instance variable
    // to avoid this proble we use this keyword
    // this referce to the current object 
     Thiskeyword(int a) {
        this.a = a;
    }

    public void disp(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Thiskeyword tk = new Thiskeyword(100);
        tk.disp();
    }

    
}
