/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.LambdaExpression;

/**
 *
 * @author mitz
 */
public class LambdaExpression {

    public static void main(String[] args) {
        FunctionalInterface fi = (int x) -> System.out.println(x * 2);
        fi.singleAbstractFunction(5);
        FunctionalInterface fi2 = (int x) -> System.out.println(x * 3);
        fi2.singleAbstractFunction(5);
        fi2.normalFunction(5);
        AnotherFunctionalInterface afi = () -> System.out.println("empty lambda expression");
        afi.anotherAbstractFunction();
    }
}

//An interface with single abstract method is called functional interface
//Example java.lang.Runnable
interface FunctionalInterface {

    void singleAbstractFunction(int x);

    default void normalFunction(int x) {
        System.out.println(x);
    }
}

interface AnotherFunctionalInterface {

    void anotherAbstractFunction();
}


/*
conclusion:
1. change the method on the fly
2. function created without belonging to any class
*/
