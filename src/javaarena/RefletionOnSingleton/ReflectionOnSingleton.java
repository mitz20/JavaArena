/*
 overcome refletion on singleton using enum
 */
package javaarena.RefletionOnSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author mitz
 */
public class ReflectionOnSingleton {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Singleton instance1 = Singleton.singleton;
        Singleton instance2 = null;
        
        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            instance2 = (Singleton) constructor.newInstance();
            break;
        }
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        
        EnumSingleton.INSTANCE.printer();
        
    }
}

class Singleton {
    public static Singleton singleton = new Singleton();
    private Singleton(){}
}

enum EnumSingleton {
    INSTANCE;
    private EnumSingleton(){
        System.out.println("built in call");
    }
    public void printer(){
        System.out.println("checking");
    }
}

class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

