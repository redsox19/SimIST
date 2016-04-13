/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vqm5108
 */
public class CoffeeAddict extends Student 
{
    private int coffeeNeed =0;
    
    public CoffeeAddict(String fName, String lName, int age, int studentIDnum, double GPA, String classStanding)
    {
        super(fName, lName, age, studentIDnum, GPA, classStanding);
    }
    
    if(coffeeNeed <= 50)
    {
        System.out.println("I need some coffee!!");
    }
    else if(coffeeNeed > 50)
    {
        System.out.println("I had my coffee for today");
    }
}
