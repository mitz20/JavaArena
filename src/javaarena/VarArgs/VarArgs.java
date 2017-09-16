/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.VarArgs;

/**
 *
 * @author mitz
 */
public class VarArgs {

    public static void main(String[] args) {
        printer();
        printer(1, 2, 3);
//        printer("1","2");
    }

    public static void printer(int... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}
