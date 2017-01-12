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
public class Hippo {
    private String name;
    private double weight;
    
    public Hippo(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        //return name;
        return "Name: " + name + ", Weight: " + weight;
    }

}
