package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    Location loc = new Location(0, 0);
    PacMan pacman = frame.addPacMan(loc);
    Map map = frame.getMap();
    assertTrue(map.getLoc(loc).contains(Map.Type.PACMAN));
    
    assertTrue(map.getLoc(new Location(-1, 0)).contains(Map.Type.WALL));
    assertTrue(map.getLoc(new Location(1, 1)).contains(Map.Type.COOKIE));
  }
}
