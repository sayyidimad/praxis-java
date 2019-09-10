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
public class MountainBike extends Bicycle {

    /**
     * the MountainBike subclass has one field
     */
    public int seatHeight;

//    the MountainBike subclass has one constructor
    public MountainBike(int startCadence, int startGear, int startSpeed, int startHeight) {
        super(startCadence, startGear, startSpeed);
        seatHeight = startHeight;
    }

//    the MountainBike subclass has one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
}
