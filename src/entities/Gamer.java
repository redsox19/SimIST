package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;



/**
 *
 * @author Aaron McFarland
 */
public class Gamer extends Student implements ActionListener {
    private int gamingNeed;         // Need to play video games
    private int satisfaction = 100; // Satifaction level
    
    Gamer(String fName, String lName, int age, int studentIDnum, double GPA, String year){
        super(fName, lName, age, studentIDnum, GPA, year);
        
        gamingNeed = 0;      
       
        Timer t = new Timer(1000,this); // Gaming need will increase by one every second.
        t.start();
    }
    
    // This method will make the character go game.
    // This will be used if the class is used as a controller.
    public void goGame(){
        
    }

    // Timer for the gaming need to increase.
    @Override
    public void actionPerformed(ActionEvent ae) {
        gamingNeed++;
        // When gaming need reaches 50, satifaction wil decrease.
        if(gamingNeed >= 50){
            satisfaction--;
            System.out.println(satisfaction);
        }
        // When gaming need reaches 75 the character will run the "goGame" method.
        if(gamingNeed >= 75){
            //goGame;
        }
    }
}
