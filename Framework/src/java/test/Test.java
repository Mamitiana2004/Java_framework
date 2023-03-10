/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author mamit
 */
public class Test {
    
    public static void where(){
        if(System.getProperty("catalina.base")!=null){
            System.out.println("Server");
        }
        else{
            System.out.println("system");
        }
    }
    
    public static void main(String[] args) {
        Test.where();
    }
    
}
