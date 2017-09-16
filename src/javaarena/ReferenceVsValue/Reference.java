/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarena.ReferenceVsValue;

/**
 *
 * @author mitz
 */
public class Reference {
    public static void main(String[] args){
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        Swap s = new Swap();
        System.out.println(p1.x+" "+p1.y);
        System.out.println(p2.x+" "+p2.y);
        s.trickySwap(p1,p2);
        System.out.println(p1.x+" "+p1.y);
        System.out.println(p2.x+" "+p2.y);
        s.badSwap(p1, p2);
        System.out.println(p1.x+" "+p1.y);
        System.out.println(p2.x+" "+p2.y);
    }
}

class Swap{
    void trickySwap(Point p1, Point p2){
        int temp = p1.x;
        p1.x = p2.x;
        p2.x = temp;
    }
    void badSwap(Point p1, Point p2){
        Point temp = p1;
        p1 = p2;
        p2 = temp;
    }
}

class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}