package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
	Noframe frame = new Noframe();
	Noframe frame2 = new Noframe();
	pacman = frame.addPacMan(new Location(1,1));
	pacman2= frame2.addPacMan(new Location(1,1));
	ghost = frame.addGhost(new Location(1,2),"blinky",Color.red);
	//a ghost is nearby pacman
	near = ghost.attack();
	farGhost = frame2.addGhost(new Location(1,4), "sad",Color.red);
	//a ghost is not nearby pacman
	not_near= farGhost.attack();
	assertTrue(near==true);
	assertTrue(not_near==false);
    	return
  }
}
