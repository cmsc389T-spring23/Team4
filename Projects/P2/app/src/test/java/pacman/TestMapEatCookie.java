package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();
	  PacMan pacman= frame.addPacMan(new Location(1,1));
	  Map map = frame.getMap();
	  //should return a cookie component and increment cookies
	  JComponent cookie =map.eatCookie("pacman");
	  int incremented = map.getCookies();
	  //should return null and not increment
	  JComponent noCookie= map.eatCookie("pacman");
	  int noincremented= map.getCookies();

	  assertTrue(cookie!=null);
	  assertTrue(noCookie==null);
	  assertTrue(incremented==1);
	  assertTrue(noincremented==1);
  }
}
