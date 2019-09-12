/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author sayyid
 */
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

//        get an object of Shape Rounded Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
//        call draw method of Shape Rectangle
        shape1.draw();

//        get an object of Shape Rounded Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
//        call draw method of Shape Square
        shape2.draw();

//        get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

//        get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
//        call draw method of Shape Rectangle
        shape3.draw();

//      get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
//        call draw method of Shape Square
        shape4.draw();
    }
}
