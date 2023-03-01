package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
	  
	  NoFrame frame = new NoFrame();

	  Ghost ghostTest = frame.addGhost(new Location(0,0),"test_ghost",Color.RED);
	  ArrayList<Location> check = ghostTest.get_valid_moves();

	  //check if no valid moves/does not exist
	  assertTrue(!check);

	  ghostTest = frame.addGhost(new Location(5,5),"test_ghost2",Color.BLUE);
	  check = ghostTest.get_valid_moves();

	  //check if valid move is in list
	  assertTrue(check.contains(new Location(4,5)));
	  
	  return;
  }
}
