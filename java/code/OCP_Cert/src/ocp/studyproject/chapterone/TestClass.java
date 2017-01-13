/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.studyproject.chapterone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ocp.studyproject.chapterone.cat.BigCat;
import ocp.studyproject.chapterone.enumtest.Season;

/**
 *
 * @author cuencam
 */
public class TestClass {
    
    public static void main (String... args) {
               
        reviewEnum();
        reviewEquals();
        overrideToString();
        //bigCatImpl();
    }
    
    public static void reviewEnum() {
        
        System.out.println("Start enum review");
        System.out.println(" ");
        
        Season s = Season.SUMMER;
        System.out.println("print s->" + s);
        System.out.println("s == Season.SUMMER? ->" + (             s == Season.SUMMER));
        
        System.out.println("Get the enum values as array");
        
        for (Season s1: Season.values())
        {
            System.out.print(s1.name() + " " + s1.ordinal());
        }
        System.out.println("______________________________");
        System.out.println("End enum review");
        System.out.println(" ");
    }
    
    public static void reviewEquals(){
        String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2));
        
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2));
    }
    
    //Coding equals, hashCode and toString
    public static void overrideToString(){
        System.out.println(new ArrayList<Object>());
        System.out.println(new String[0]);
        
        Hippo h1 = new Hippo("Harry", 3100);
        System.out.println(h1);
    }    
    
    /**
     * Access modifiers review
     */
    public static void bigCatImpl(){
        
        //access modifiers example
        BigCat cat = new BigCat();
        
        System.out.println(cat.name);
        //System.out.println(cat.hasFur);
        //System.out.println(cat.hasPaws);
        //System.out.println(cat.id);
        
    }
    
}
