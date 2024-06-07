public class Arrays {
    
    // arrays are objects in java 
    // array contains similar types of data in contigious memory locations
    // array index starts with zero 
    // syntax of array 

    // datatype var name [];
    public static void main(String[] args) {
    int [] array= {1,2,3,4,5};

    // objects of arrays 
    int  a[] = new int [10];

    for (int b : array){
        System.out.println("array elemts :"+b);
    }
    }
}
