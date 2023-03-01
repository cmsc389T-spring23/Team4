package pacman;
import junit.framework.*;
import java.io.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Players
    PacMan pacman1 = frame.addPacMan(new Location(10, 10)); //Creates PacMan at location x, y
    Ghost ghost1 = frame.addGhost(new Location(9, 9), "name", Color.red); //Creates a red ghost named "name" at location x,y

    PacMan pacman2 = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y
    Ghost ghost2 = frame.addGhost(new Location(3, 3), "name", Color.red); //Creates a red ghost named "name" at location x,y

    PacMan pacman3 = frame.addPacMan(new Location(1, 1));
    Ghost ghost3 = frame.addGhost(new Location(2, 1), "name", Color.red);
    
    //assertFalse(frame.getMap().attack(ghost1.myName)); //should not be able to attack diagonally
    //assertFalse(frame.getMap().attack(ghost2.myName)); //out of range
    //assertTrue(frame.getMap().attack(ghost3.myName));
  }
}
