package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
	Noframe frame = new Noframe();
	pacman = frame.addPacMan(new Location(1,1));
	ghost = frame.addGhost(new Location(1,2),"blinky",Color.red);
	//a ghost is nearby pacman
	near = ghost.attack();
	farGhost = frame.addGhost(new Location(1,4), "sad",Color.red);
	//a ghost is not nearby pacman
	not_near= farGhost.attack();

    	return near!=null && not_near==null;
  }
}
