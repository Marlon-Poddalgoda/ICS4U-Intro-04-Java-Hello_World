package ca.mths.intro.intro_01.java.hello_world;
/**
* The Hello World! program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Marlon
* @version 1.0
* @since   2021-04-20
*/
final class HelloWorld {
    private HelloWorld() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
    }
    /**
    * This method prints out "Hello, World!".
    * @param args
    */
    public static void main(final String[] args) {
        System.out.println("Hello, World!");
    }
}
