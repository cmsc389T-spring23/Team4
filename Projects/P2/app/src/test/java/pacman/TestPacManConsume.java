package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import javax.swing.JComponent;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
	//our frame  
	NoFrame frame = new NoFrame();
	//adding pacman to 1,1 where a cookie should be present
	PacMan pacman=frame.addPacMan(new Location(1,1));
	JComponent cookie=pacman.consume();

	//check to see if cookie is not present/consume has removed the cookie in that location
	JComponent noCookie= pacman.consume();

	assertTrue(cookie!= null);
	assertTrue(noCookie==null);
  }
}
