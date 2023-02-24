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
    return false;
  }

  public boolean attack() {
    return false;
  }
}
