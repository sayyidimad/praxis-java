/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author sayyid
 */
public class SingleObject {
//    create an object of SingleObject
//    private static SingleObject instance = new SingleObject();

//    make the constructor private so that this class cannot be
//    istantiated
    private SingleObject() {
    }

//    Get the only object available
    public static SingleObject getInstance() {
//        return instance;
        return SingleObjectHolder.INSTANCE;
    }
    
    public void showMessage(){
        System.out.println("Hello World!");
    }

    private static class SingleObjectHolder {

        private static final SingleObject INSTANCE = new SingleObject();
    }
}
