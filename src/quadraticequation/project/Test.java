/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation.project;

import java.util.Scanner;

/**
 *
 * @author MOHAM
 */
public class Test{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter values for a, b, and c");
      Scanner input = new Scanner(System.in);
      
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      QuadraticEquation equation=new QuadraticEquation(a,b,c);
      
      if(equation.getDiscriminant()==0)
            System.out.println("the two roots = "+equation.getRoot1());
      else if(equation.getDiscriminant()>0){
          System.out.println("first root= "+equation.getRoot1());
         System.out.println("second root= "+equation.getRoot2());
      }
      else
            System.out.println("“The equation has no roots");
          
    }
    //mohamed
    
}
