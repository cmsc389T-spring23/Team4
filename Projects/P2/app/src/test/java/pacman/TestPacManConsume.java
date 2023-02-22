package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
	//our frame  
	Noframe frame = new MainFrame();
	//adding pacman to 1,1 where a cookie should be present
	pacman=frame.addPacMan(new Location(1,1));
	cookie=pacman.consume();
	//consume should return the cookie component and remove it from the frame, it should also increment the counter
	if(!cookie) System.out.println("Cookie Present but not returned/not found");
	//check to see if cookie is not present/consume has removed the cookie in that location
	noCookie= pacman.consume();
	if(noCookie) System.out.println("No Cookie present, but was returned/never removed");	
	return cookie && !noCookie;
  }
}
