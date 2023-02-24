package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    Noframe frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(0, 0), "name", Color.red);
    assertTrue(ghost.move())
    assertTrue(ghost.move())
    assertTrue(ghost.move())
    assertTrue(ghost.move())
    assertTrue(ghost.move())
  }
}
