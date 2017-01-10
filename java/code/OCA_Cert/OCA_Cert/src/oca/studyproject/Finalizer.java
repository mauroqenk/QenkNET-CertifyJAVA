/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.studyproject;

/**
 *
 * @author cuencam
 */
public class Finalizer {
    @Override
    protected void finalize() {
        System.out.println("Calling finalize");
    }
    
    public static void main (String... args){
        new Finalizer();
        
        Finalizer f = new Finalizer();
    }
}
