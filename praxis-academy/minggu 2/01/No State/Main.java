/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoState;

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
        Calculator calculator = new Calculator();
        System.out.println("Jumlah a + b = " + calculator.sum(98, 76));
        
        CalculatorExternal external = new CalculatorExternal();
        System.out.println("Fungsi Calculator external + a = " + external.sum(6));
    }
    
}
