public class Strings {
    //String are the classes present in java lang package 
    // we can use string as datatype also we saw that 
    //string classes are final classes 
    // that means we cannot extend that class 
    // String objects are immutable in nature
    // strings in nothing but a sequence of charectors .."khaja ameen.."
    //we can create a string object in 2 ways 

    // 1) String str = "khaja ameen";
    // 2) String str2 = new String("kenzee jod")
   public static void main(String[] args) {
    
    // some string methods 
    String str = "khajaameen";

    System.out.println(str.length());
    System.out.println(str.charAt(2));
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.isEmpty());
    System.out.println(str.concat("jod"));
    System.out.println(str.contains("k"));
}

    
}
