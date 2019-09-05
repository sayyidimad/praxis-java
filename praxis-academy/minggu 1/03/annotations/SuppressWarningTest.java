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
class Deprecate {
    @Deprecated
    public void Display() {
        System.out.println("Deprecatedtest display()");
    }
}

public class SuppressWarningTest {

    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args) {
        Deprecate d1 = new Deprecate();
        d1.Display();
    }
}
