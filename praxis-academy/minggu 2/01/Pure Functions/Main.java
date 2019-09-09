/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PureFunctions;

/**
 *
 * @author sayyid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ObjectWithPureFunction owpf = new ObjectWithPureFunction();
        System.out.println("Object with pure function: " + owpf.sum(12, 16));
        
        ObjectWithNonPureFunction ownpf = new ObjectWithNonPureFunction();
        System.out.println("Object with non-pure function: " + ownpf.add(14));
    }
    
}
