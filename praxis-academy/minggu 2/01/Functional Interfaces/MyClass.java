/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterfaces;

/**
 *
 * @author sayyid
 */
public class MyClass implements MyInterface {

    @Override
    public void run() {
        System.out.println("running...!");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doIt() {
        MyInterface.super.doIt(); //To change body of generated methods, choose Tools | Templates.
    }
}
