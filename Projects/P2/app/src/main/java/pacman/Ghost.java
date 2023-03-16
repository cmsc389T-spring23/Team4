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

	  int curr_x = myLoc.x;
	  int curr_y = myLoc.y;
	  // Check each location to see if a wall resides within. If not, add to ArrayList
	  ArrayList<Location> to_ret= new ArrayList<Location>();
	  Location potential_moves[] = {new Location(curr_x + 1, curr_y),
		  new Location(curr_x - 1, curr_y),
		  new Location(curr_x, curr_y + 1),
		  new Location(curr_x, curr_y - 1)};
	  
	  for(Location move: potential_moves){
		  HashSet<Map.Type> check = myMap.getLoc(move);
		  if(!check.contains(Map.Type.WALL) && !check.isEmpty()){
			  to_ret.add(move);
		  }
	  }
	  if(to_ret.size() == 0){
		  return null;
	  }
	  return to_ret;
  }

  public boolean move() {
    ArrayList<Location> valid_moves = get_valid_moves();
    if (valid_moves == null) {
      return false;
    }
    int rand = (int) (Math.random() * valid_moves.size());
    Location new_loc = valid_moves.get(rand);
    myMap.move(myName, new_loc);
    myLoc = new_loc;
    return true;
  }

  public boolean is_pacman_in_range() {
    // scanning will start in a 3x3 grid with the ghost in the middle
    int startX = myLoc.x - 1;
    int startY = myLoc.y - 1;

    // scanning 3x3 grid for a pacman type
    for (int row = startX; row < startX; row++) {
      for (int col = startY; col < startY; col++) {
        if (myMap.getLoc(new Location(row, col)).contains(Map.Type.PACMAN)) // checking location for pacman
          return true; // at least 1 pacman found
      }
    }

    return false;
  }

  public boolean attack() {
    if (!is_pacman_in_range()) {
      return myMap.attack(myName);
    } else {
      return false;
    }
  }
}
