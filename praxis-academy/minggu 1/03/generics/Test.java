/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

// We don't need to typecast individual members of ArrayList
import java.util.ArrayList;

/**
 *
 * @author sayyid
 */
// A Simple Java program to show working of user defined
// Generic functions
//class Test {
//    A Generic method example
//    static <T> void genericDisplay(T element) {
//        System.out.println(element.getClass().getName() + " = " + element);
//    }
//    Driver method
//    public static void main(String[] args) {
//        Calling generic method with Integer argument
//        genericDisplay(11);
//        Calling generic method with String argument
//        genericDisplay("GeeksForGeeks");
//        Calling generic method with double argument
//        genericDisplay(1.0);
//    }
class Test {

    public static void main(String[] args) {
//        Creating a an ArrayList with String specified
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sachin");
        al.add("Rahul");

//        Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
    }
}
