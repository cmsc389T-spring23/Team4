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
    ArrayList<Location> valid_moves = get_valid_moves();

    // picks a random location from the list of valid moves
    if (valid_moves != null && !valid_moves.isEmpty()) {
      this.myLoc = valid_moves.get((int) (Math.random() * valid_moves.size()));
      return myMap.move(this.myName, this.myLoc, Map.Type.GHOST);
    }
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
    if(is_pacman_in_range()){
	return map.attack(myName);
    } else {
	return false;
    }
  }
}
