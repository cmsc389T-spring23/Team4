package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
	  
	  NoFrame frame = new NoFrame();

	  frame.addGhost(new Location(0,0));

	  ArrayList<Location> check = new ArrayList<Location>();

	  check = frame.ghost.get_valid_moves();

	  //check if out of bounds move is valid. should be false
	  assertFalse(check.contains(new Location(-1, 0)));
	  //check if valid move is in list
	  assertTrue(check.contains(new Location(1,0)));
	  
	  return;
  }
}
