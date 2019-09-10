/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumType;

import java.time.DayOfWeek;

/**
 *
 * @author sayyid
 */
public class EnumTest {
    DayOfWeek day;

    public EnumTest(DayOfWeek day) {
        this.day = day;
    }
    
    public void tellItLikeItIs(){
        switch(day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnumTest firstDay = new EnumTest(DayOfWeek.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(DayOfWeek.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(DayOfWeek.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(DayOfWeek.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(DayOfWeek.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
