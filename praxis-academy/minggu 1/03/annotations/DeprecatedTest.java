/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;

/**
 *
 * @author sayyid
 */
public class DeprecatedTest {
    @Deprecated
    public void Display(){
        System.out.println("Deprecatedtest display()");
    }
    
    public static void main(String[] args) {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}
