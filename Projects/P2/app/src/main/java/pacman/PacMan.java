package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    //going to start scan in a 3x3 grid starting from top left of pacman's location with pacman at center
    int startX = myLoc.x - 1; 
    int startY = myLoc.y - 1;

    //looking for ghost in surrounding area
    for(int row = startX; row < startX + 3; row++)
    {
      for(int col = startY; col < startY + 3; col++)
      {
        if(myMap.getLoc(new Location(row, col)).contains(Map.Type.GHOST)) //checking location (row,col)
          return true;
      }
    }
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
