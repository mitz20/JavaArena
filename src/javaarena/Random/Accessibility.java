/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.Random;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author mitz
 */
class Access {
    private String name;
    
    private void Access(){
        System.out.println("in the constructor");
    }
    
    private void func(){
        System.out.println("private member accessed");
        System.out.println(name);
    }
    private void printInt(int i){
        System.out.println(i);
    }
    private void printInts(int i, int j){
        System.out.println(i+"::"+j);
    }
    public void print(){
        System.out.println("public");
    }
}

public class Accessibility{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
        Class c = Class.forName("javaarena.Random.Access");
        Object o = c.newInstance();
        
        Constructor[] constructors = c.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            constructor.newInstance();
        }
        
        Field f1 = c.getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(o, "amit");
        
        Method m1 = c.getDeclaredMethod("func");
        m1.setAccessible(true);
        m1.invoke(o);
        
        Method m2 = c.getDeclaredMethod("printInt", int.class);
        m2.setAccessible(true);
        m2.invoke(o, 12);
        
        Method m3 = c.getDeclaredMethod("printInts", int.class, int.class);
        m3.setAccessible(true);
        m3.invoke(o, 1, 2);
        
    }
}
