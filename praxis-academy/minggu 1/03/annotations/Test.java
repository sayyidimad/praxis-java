/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation {
    String Developer() default "Sayyid";
    String Expirydate();
}

/**
 *
 * @author sayyid
 */
public class Test {
    @TestAnnotation(Developer = "data", Expirydate = "01-10-2020")
    void fun1(){
        System.err.println("Test method 1");
    }
    
    @TestAnnotation(Developer = "fair", Expirydate = "01-10-2020")
    void fun2(){
        System.out.println("Test method 2");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
