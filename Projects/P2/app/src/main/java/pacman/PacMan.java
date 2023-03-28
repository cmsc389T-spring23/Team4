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
		if(to_ret.size() > 0){
			return null;
		}
		return to_ret;
	}

  public boolean move() {
    ArrayList<Location> valid_moves = get_valid_moves();
    if (valid_moves != null && valid_moves.isEmpty()) {

      // picks a random move from the list of valid moves
      this.myLoc = valid_moves.get((int) (Math.random() * valid_moves.size()));
      return myMap.move(this.myName, this.myLoc, Map.Type.PACMAN);
    }
    return false;
  }
  
  public boolean is_ghost_in_range() {
    //going to start scan in a 3x3 grid starting from top left of pacman's location with pacman at center
    int startX = myLoc.x - 1; 
    int startY = myLoc.y - 1;

    //looking for ghost in surrounding area
    for(int row = startX; row < startX; row++)
    {
      for(int col = startY; col < startY; col++)
      {
        if(myMap.getLoc(new Location(row, col)).contains(Map.Type.GHOST)) //checking location (row,col)
          return true;
      }
    }
    return false;
  }

  public JComponent consume() {
	  HashSet<Map.Type> locations = myMap.getLoc(myLoc);
	  if(locations!=null && locations.contains(Map.Type.COOKIE)){
		return myMap.eatCookie(myName);
    	} else {
		return null;
    }
  }
}
