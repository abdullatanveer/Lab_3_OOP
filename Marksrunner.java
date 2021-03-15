/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksrunner;

/**
 *
 * @author abdul
 */
public class Marksrunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        marks a=new marks();
        a.marks1=90;
        a.marks2=86;
        a.marks3=78;
        a.sum();
        a.display();
        
        marks b=new marks(98,57,89);
        b.sum();
        b.display();
        
    }
    
}