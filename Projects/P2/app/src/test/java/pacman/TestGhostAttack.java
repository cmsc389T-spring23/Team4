package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
	NoFrame frame = new NoFrame();
	NoFrame frame2 = new NoFrame();
	PacMan pacman = frame.addPacMan(new Location(1,1));
	PacMan pacman2= frame2.addPacMan(new Location(1,1));
	Ghost ghost = frame.addGhost(new Location(1,2),"blinky",Color.red);
	//a ghost is nearby pacman
	boolean near = ghost.attack();
	Ghost farGhost = frame2.addGhost(new Location(1,4), "sad",Color.red);
	//a ghost is not nearby pacman
	boolean not_near= farGhost.attack();
	assertTrue(near==true);
	assertTrue(not_near==false);
    	return;
  }
}
