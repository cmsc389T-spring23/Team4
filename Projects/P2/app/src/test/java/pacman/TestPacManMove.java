package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(0, 0));
    assertTrue(pacman.move());
    assertTrue(pacman.move());
    assertTrue(pacman.move());
    assertTrue(pacman.move());
    assertTrue(pacman.move());
  }
}
