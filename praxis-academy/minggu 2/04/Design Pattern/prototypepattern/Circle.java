/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

/**
 *
 * @author sayyid
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }
    
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    
}
