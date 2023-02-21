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
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
