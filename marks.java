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
public class marks {
    int marks1;
    int marks2;
    int marks3;
    public marks(){
        
    }
    public marks(int m1,int m2, int m3){
        marks1=m1;
        marks2=m2;
        marks3=m3;
     
    }
    public  int sum(){
         return marks1+marks2+marks3;
    }
    public void display(){
        System.out.println("sum of marks is :" +" "+sum());
    }
    
}
