package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    //Creating A Map
    //Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
    Ghost ghost = frame.addGhost(new Location(0, 0), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(0, 1)); //Creates PacMan at location x, y
  }
}
