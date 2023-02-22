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
    ArrayList<Location> valid_moves = get_valid_moves();
    if (valid_moves != null && !valid_moves.isEmpty()) {

      // picks a random move from the list of valid moves
      this.myLoc = valid_moves.get((int) (Math.random() * valid_moves.size()));
      return myMap.move(this.myName, this.myLoc, Map.Type.PACMAN);
    }
    return false;
  }
  
  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
