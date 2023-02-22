package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();
	  pacman= frame.addPacMan(new Location(1,1));
	  map = frame.getMap();
	  //should return a cookie component and increment cookies
	  cookie =map.eatCookie("pacman");
	  incremented = map.getCookies();
	  //should return null and not increment
	  noCookie= map.eatCookie("pacman");
	  noincremented= map.getCookies();
	  return cookie && !noCookie && (incremented==1) && (noincremented==1);
  }
}
