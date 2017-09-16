/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.Random;

/**
 *
 * @author mitz
 */

enum ThreadStatesEnum {
    START,
    RUNNING,
    WAITING,
    DEAD;
}

class ThreadStateConstants {
    public static final int START = 1;
    public static final int RUNNING = 1;
    public static final int WAITING = 1;
    public static final int DEAD = 1;
}

public class EnumVsConstants {
    
    static void enumIllustration(ThreadStatesEnum tenum){
        if(tenum == ThreadStatesEnum.START){
            System.out.println("starting thread");
        }else{
            System.out.println("not starting thread");
        }
    }
    
    static void constanstsIllustration(int i){
        if(i == ThreadStateConstants.START){
            System.out.println("starting thread");
        }else{
            System.out.println("not starting thread");
        }
    }
    
    public static void main(String[] args){
        System.out.println(ThreadStatesEnum.START);
        enumIllustration(ThreadStatesEnum.START);
        constanstsIllustration(1);
    }
}


/*
Benefits :
1.tight binding with parameters
*/