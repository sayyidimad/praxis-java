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
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        illegal construct
//        Compile Time Error: The constructor SingleObject() is not visible
//        SingleObject object = new SingleObject();

//        Get the only object available
        SingleObject object = SingleObject.getInstance();
        
//        show the message
        object.showMessage();
    }    
}
