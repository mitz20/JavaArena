/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.SerializationOnSingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.out;

/**
 *
 * @author mitz
 */
public class SerializationOnSingleton {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Singleton instance1 = Singleton.instance;
        
        FileOutputStream fos = new FileOutputStream("serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance1);
        
        FileInputStream fis = new FileInputStream("serial.txt");
        ObjectInputStream osi = new ObjectInputStream(fis);
        Singleton instance2 = (Singleton) osi.readObject();
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        
        //resolved
        ResolvedSingleton instance3 = ResolvedSingleton.instance;
        FileOutputStream fos1 = new FileOutputStream("serial1.txt");
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        oos1.writeObject(instance3);
        
        FileInputStream fis1 = new FileInputStream("serial1.txt");
        ObjectInputStream osi1 = new ObjectInputStream(fis1);
        ResolvedSingleton instance4 = (ResolvedSingleton) osi1.readObject();
        
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());
        
    }
    
}

class Singleton implements Serializable {

    public static Singleton instance = new Singleton();

    private Singleton() {
    }
}


/*
readResolve is used for replacing the object read from the stream. 
The only use I've ever seen for this is enforcing singletons; 
when an object is read, replace it with the singleton instance. 
This ensures that nobody can create another instance by serializing and deserializing the singleton.
*/

class ResolvedSingleton implements Serializable {
    public static ResolvedSingleton instance = new ResolvedSingleton();
    private ResolvedSingleton(){}
    
    protected Object readResolve(){
        return instance;
    }
}
