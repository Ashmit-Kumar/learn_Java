package Unit_3;
// If an interface contains a single abstract method in it it is known as functional interface.
// It is also known as SAM(single abstract method) interface

//ways to implement functional interface
// with Lambda expression 
// without Lambda expression
//using anonymous class

@FunctionalInterface
public interface Fu{
    String show(String a);
    default void a(){
        System.out.println("1");
    }
    default void b(){
        System.out.println("2");
    }
}

//1) With Lambda expression
//implement keyword 


