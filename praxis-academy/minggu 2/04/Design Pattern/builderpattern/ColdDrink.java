/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author sayyid
 */
public abstract class ColdDrink implements Item {

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
