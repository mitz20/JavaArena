/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.Interfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author mitz
 */
public class SerializableInterfaceWrite {

    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileOps fops = new FileOps(2, "amit");
        //serializing
        FileOutputStream fos = new FileOutputStream("names.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(fops);
        }
    }
}

class FileOps implements Serializable {
    private static final long serialVersionUID = 2L;

    int a;
    String b;

    FileOps(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
