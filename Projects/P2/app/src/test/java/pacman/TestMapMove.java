package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {

	  NoFrame frame= new NoFrame();

	  frame.addPacMan(new Location(3,3));

	  PacMan test = new PacMan("test",new Location(5,5), frame.getMap());

	  Location valid_move = new Location(3,4);
	  Location invalid_move = new Location(5,6);

	  //Tests for Map move. The first should pass due to being on the map already
	  assertTrue(frame.getMap().move("pacman",valid_move,Map.Type.PACMAN));
	  //Should not pass due to not being an object on the map prior
	  assertFalse(frame.getMap().move("test", invalid_move, Map.Type.PACMAN));
	  
	  return;
  }
}
