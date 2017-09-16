/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.CloningOnSingleton;

/**
 *
 * @author mitz
 */
public class CloningOnSingleton {
    public static void main(String[] args) throws CloneNotSupportedException{
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = (Singleton) instance1.clone();
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        
        NonCloneableSingleton instance3 = NonCloneableSingleton.instance;
        NonCloneableSingleton instance4 = (NonCloneableSingleton) instance3.clone();
        
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
    }
}

class SuperClass implements Cloneable {
    int i = 10;
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


class Singleton extends SuperClass {
    public static Singleton instance = new Singleton();
    private Singleton(){}
}


/*
To overcome this issue, override clone() method and 
throw an exception from clone method that is CloneNotSupportedException
*/
class NonCloneableSingleton extends SuperClass {
    public static NonCloneableSingleton instance = new NonCloneableSingleton();
    private NonCloneableSingleton(){}
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }
}