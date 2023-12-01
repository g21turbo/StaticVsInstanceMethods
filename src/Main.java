public class Main {

    public static void main(String[] args) {

        Calculator.printSum(5,2);
        printHello(); // shorter form of Main.printHello();


        Dog spike = new Dog(); // create instance
        spike.bark(); // call instance method



    }


    // Static method example
    public static void printHello() {
        System.out.println("Hello");
    }


    // Static methods are declared using a static modifier.
    // Static methods can't access instance methods and instance variables directly.
    // They're usually used for operations that don't require any data from an instance of the class (from  'this').
    // The 'this' keyword is the current instance of a class
    // Inside a static method, we can't use the 'this' keyword

    // ----------------------------------------------------------------------

    // Instance methods belong to an instance of a class.
    // To use an instance method, we have to instantiate the class first, usually by using the 'new' keyword.
    // Instance methods can access instance methods and instance variables directly.
    // Instance methods can also access static methods and static variables directly.





}
