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

	  //check if check does not exist due to having an invalid location
	  assertTrue(!check);

	  test = frame.addPacMan(new Location(5,5));
	  check = test.get_valid_moves();


	  //check if valid move is in list
	  assertTrue(check.contains(new Location(5,4)));
	  
	  return;
  }
}
