/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.Interfaces;

/**
 *
 * @author mitz
 */
public class CloneableInterface {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Marker m = new Marker(5);
        Marker n = (Marker) m.clone();
        m.print();
        n.print();
    }
    
}

class Marker implements Cloneable{
    int a;
    Marker(int a){
        this.a = a;
    }
    
    public void print(){
        System.out.println(a+" ");
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}