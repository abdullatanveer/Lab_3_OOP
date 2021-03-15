/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_time;

/**
 *
 * @author abdul
 */
public class Test_Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time t1=new Time((int)(Math.random()*24),(int)(Math.random()*24),(int)(Math.random()*24));
        t1.displayTime();
        Time t2 = new Time();
        t2.setTime((int)(Math.random()*24),(int)(Math.random()*24),(int)(Math.random()*24));
        t2.displayTime();
    }
    
}
