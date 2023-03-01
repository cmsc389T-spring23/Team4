package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
        //Creating A Map
        NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
    
        //Creating Players
        PacMan pacman1 = frame.addPacMan(new Location(10, 10)); //Creates PacMan at location x, y
        Ghost ghost1 = frame.addGhost(new Location(9, 9), "name", Color.red); //Creates a red ghost named "name" at location x,y
        
        PacMan pacman2 = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y
        Ghost ghost2 = frame.addGhost(new Location(3, 3), "name", Color.red); //Creates a red ghost named "name" at location x,y
        
        assertTrue(pacman1.is_ghost_in_range());
        assertFalse(pacman2.is_ghost_in_range());
  }
}
