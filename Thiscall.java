public class Thiscall {
    
    Thiscall(){
        System.out.println("Welcome");
    }
    Thiscall(int a){
        this();                      // this method calling the defult constuctor 
        System.out.println(a);
    }
    public static void main(String[] args) {
        Thiscall tc = new Thiscall(10);
    }
}
