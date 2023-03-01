package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {

	  NoFrame frame = new NoFrame();

	  PacMan test = frame.addPacMan(new Location(0,0));

	  ArrayList<Location> check = test.get_valid_moves();

	  //check if out of bounds move is valid. should be false
	  assertFalse(check.contains(new Location(-1, 0)));
	  //check if valid move is in list
	  assertTrue(check.contains(new Location(1,0)));
	  
	  return;
  }
}
