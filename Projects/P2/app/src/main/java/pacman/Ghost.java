package pacman;
import java.util.ArrayList;
import java.util.HashSet;

import com.sun.jdi.Location;

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
      int random_index = (int) (Math.random() * valid_moves.size());
      Location move_to = valid_moves.get(random_index);
      this.myLoc = move_to;
      return myMap.move(this.myName, move_to, Map.Type.GHOST);
    }
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
