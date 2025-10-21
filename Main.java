import javax.swing.*;
import java.awt.event.*;
import kareltherobot.*;
//This is the starter code for Karel the Robot AP CSA Thai

public class Main implements Directions {
  public static void main(String[] args) 
	{
		//My robot's name is karel
    Robot karel = new Robot(1,1,East,20);
    World.setVisible(true);
    World.setSize(20,20);
    World.setDelay(10);

		karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    turnRight(karel);
    karel.move();
    karel.putBeeper();
    turnRight(karel);
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.turnLeft();
    karel.move();
    karel.move();
    karel.putBeeper();
    karel.move();
    karel.move();
    for (int i=0;i<5;i++){
      karel.move();
      
    }


    




    
    Robot sixseven = new Robot(5,5, North,100);
    sixseven.move();
    sixseven.move();
    sixseven.move();
    sixseven.move();
    sixseven.move();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    turnRight(sixseven);
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.turnLeft();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.turnLeft();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.turnLeft();
    sixseven.move();
    sixseven.move();
    sixseven.putBeeper();
    sixseven.move();
    sixseven.move();

  }
    

  public static void turnRight(Robot karel){
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
  }



}