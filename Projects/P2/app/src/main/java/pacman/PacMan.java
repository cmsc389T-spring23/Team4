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
    int startX = myLoc.x - 1;
    int startY = myLoc.y - 1;

    for(int row = startX; row < startX + 3; row++)
    {
      for(int col = startY; col < startY + 3; col++)
      {
        if(myMap.getLoc(myLoc).contains(Map.Type.GHOST))
          return true;
      }
    }
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
