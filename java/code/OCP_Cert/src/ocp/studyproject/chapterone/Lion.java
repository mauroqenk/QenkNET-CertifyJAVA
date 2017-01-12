/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp.studyproject.chapterone;

/**
 *
 * @author cuencam
 */
public class Lion {
    
    private int idNumber;
    private int age;
    private String name;
    
    public Lion(int idNumber, int age, String name) {
        this.idNumber =  idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if ( !(o instanceof Lion)) {
            return false;
        }
        Lion otherLion = (Lion) o;
        return this.idNumber == otherLion.idNumber;
    }
      
}
