/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.studyproject.chapterone.cat;

/**
 *
 * @author cuencam
 */
public class BigCat {
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;
    
    public static void myMethod(){
        
    }
    
    public void myMethod2(){
        
    }
}

class OtherCat extends BigCat {

    @Override
    public void myMethod2() {
        super.myMethod2(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
