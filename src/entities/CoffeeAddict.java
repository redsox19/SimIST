/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class CoffeeAddict extends Student implements ActionListener
{
    private int coffeeNeed =0;

    
   
    
    
    public CoffeeAddict(String fName, String lName, int age, int studentIDnum, double GPA, String classStanding)
    {
        super(fName, lName, age, studentIDnum, GPA, classStanding);
        Timer time = new Timer(1000, this); // setting up the timer here
         time.start(); //starting the timer
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        coffeeNeed++;
      if(coffeeNeed < 50)
      {
          coffeeNeed++;
          System.out.print("Character needs coffee" + coffeeNeed);
      }
      if(coffeeNeed > 50)
      {
          coffeeNeed--;
          System.out.print("Coffee need has been attained" + coffeeNeed);
      }
     
    }
}