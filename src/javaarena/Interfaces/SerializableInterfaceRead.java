/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.Interfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableInterfaceRead {
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
        //deserializing
        FileInputStream fis = new FileInputStream("names.txt");
        FileOps fops2;
        try (ObjectInputStream osi = new ObjectInputStream(fis)) {
            fops2 = (FileOps) osi.readObject();
        }
        
        System.out.println(fops2.a+fops2.b);
    }
}