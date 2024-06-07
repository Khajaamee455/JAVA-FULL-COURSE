 class Superkeyword {
    // Super keyword is use to call the superclass variable or superclass membbers 
    //lets take an example 
    int a = 100;

}
class Subclass extends Superkeyword{
    int a = 500 ;

    public void show(){
        System.out.println(super.a);
        System.out.println(a);
    }
    public static void main(String args[]) {
        Subclass sb = new Subclass();
        sb.show();
    }
   
}