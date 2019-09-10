/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author sayyid
 */
public class Bicycle {
    /**
     * the Bicycle class has three fields
     */
    public int cadence;
    public int gear;
    public int speed;

    /**
     * the Bicycle class has one constructor
     * @param cadence
     * @param gear
     * @param speed
     */
    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
    
    
//    the Bicycle class has four methods
    public void setCadence(int newValue){
        gear = newValue;
    }
    
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    
    public void speedUp(int increment){
        speed += increment;
    }
}
