public class Class_object {
    
    // class is blueprint for an object 
    // class is vertual part 
    // class is mixture of common properties and behaviours
    int age = 24 ;
    String colour = "brown";
    Double hight = 5.6;
    String name = "khaja ameen";

    public void eat(){

        System.out.println("Am eating now ..");
    }

    public void sleep(){
        System.out.println("am sleeping ..");
    }
    public void code(){
        System.out.println("learning class and objects ...");
    }

    public static void main(String[] args) {
        Class_object co = new Class_object();
        System.out.println(co.name);
        System.out.println(co.age);
        System.out.println(co.colour);
        System.out.println(co.hight);

        co.eat(); co.sleep(); co.code();
    }
}
