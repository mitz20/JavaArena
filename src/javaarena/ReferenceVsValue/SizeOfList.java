package javaarena.ReferenceVsValue;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitz
 */

public class SizeOfList {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(55);
        System.out.println(l.size());
        Change c = new Change();
        c.modify(l);
        System.out.println(l.size());
    }
}

class Change{
    public void modify(List<Integer> l){
        l = new ArrayList<>();
        System.out.println(l.size());
    }
}