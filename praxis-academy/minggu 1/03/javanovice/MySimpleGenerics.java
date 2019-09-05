/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanovice;

/**
 *
 * @author sayyid
 */
public class MySimpleGenerics {
    public static void main(String[] args) {
//        we are going to create SimpleGeneric object with String as type parameter
        SimpleGeneric<String> sgs = new SimpleGeneric<String>("JAVA2NOVICE");
        sgs.printType();
//        we are going to create SimpleGeneric object with Boolean as type parameter
        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();
    }
}

/**
* Here T is a type parameter, and it will be replaced with
* actual type when the object got created.
*/
class SimpleGeneric<T>{
//    declaration of object type T
    private T objReff = null;
    
//    constructor to accept type parameter T
    public SimpleGeneric(T param){
        this.objReff = param;
    }
    
    public T getObjReff(){
        return this.objReff;
    }
    
//    this method prints the holding parameter type
    public void printType(){
        System.out.println("Type: " + objReff.getClass().getName());
    }
}