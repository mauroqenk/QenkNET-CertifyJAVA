/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.studyproject.chapterone;

import ocp.studyproject.chapterone.cat.BigCat;

/**
 *
 * @author cuencam
 */
public class TestClass {
    
    public static void main (String... args) {
        
        
        
        BigCat cat = new BigCat();
        
        //access modifiers example
        System.out.println(cat.name);
        //System.out.println(cat.hasFur);
        //System.out.println(cat.hasPaws);
        //System.out.println(cat.id);
    }
    
}
