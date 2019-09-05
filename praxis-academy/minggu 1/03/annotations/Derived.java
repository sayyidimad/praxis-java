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

class Base {
    public void Display(){
        System.out.println("Base display()");
    }
    
    public static void main(String[] args) {
        Base t1 = new Derived();
        t1.Display();
    }
}

class Derived extends Base {
    @Override
    public void Display() {
        System.out.println("Derived display()");
    }
}
