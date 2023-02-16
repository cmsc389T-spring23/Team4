package pacman;
import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
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

  public boolean is_pacman_in_range() {
    //scanning will start in a 3x3 grid with the ghost in the middle
    int startX = myLoc.x - 1; 
    int startY = myLoc.y - 1;

    //scanning 3x3 grid for a pacman type
    for(int row = startX; row < startX + 3; row++)
    {
      for(int col = startY; col < startY + 3; col++)
      {
        if(myMap.getLoc(new Location(row, col)).contains(Map.Type.PACMAN)) //checking location for pacman
          return true; //at least 1 pacman found
      }
    }

    return false;
  }

  public boolean attack() {
    return false;
  }
}
