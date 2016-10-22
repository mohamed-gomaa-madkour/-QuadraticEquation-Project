/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation.project;

/**
 *
 * @author MOHAM
 */
public class QuadraticEquation {
    private int a=0;
    private int b=0;
    private int c=0;

    public QuadraticEquation(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
 
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


   public double getDiscriminant(){
       return Math.pow(this.b, 2)-4*this.a*this.c;
   
   }   
   public double getRoot1(){
   
   return (-b+Math.sqrt(getDiscriminant()))/(2*a);
   
   }
    public double getRoot2(){
   
   return (-b-Math.sqrt(getDiscriminant()))/(2*a);
   
   }
     
    
    
    
    
    
}
