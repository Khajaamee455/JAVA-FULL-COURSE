public class Methods {
    // methods are block of codes which can take input from the user and procees it and 
    // gives output
    // method runs only when it is called
    // using methods we can achive the code reusebility

    // 2 types of methods are there 
    // 1) usedefined methods 
    // 2 ) pre- defined methods 

    // we saw that scanner method like nextInt(); - this is a pre defined method
    // user defined method means we can create that method and we named it as our need.

    public void display(){
        // this is user defind method 
        System.out.println("Display results..");
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.display();
    }
}
