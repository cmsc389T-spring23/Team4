package pacman;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
	Location old_loc = locations.get(name);

	if(old_loc == null){
		return false;
	}
	locations.put(name, loc);
	JComponent comp = components.get(name);
	if(comp == null){
		return false;
	}
	comp.setLocation(loc.x, loc.y);

	// updates old location to remove the type from the field
	HashSet<Type> update_loc = field.get(old_loc);
	update_loc.remove(type);
	//updates new location to add type
	update_loc = field.get(loc);
	update_loc.add(type);
	
    return true;
  }

  public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method
    return null;
  }

  public boolean attack(String Name) {
    gameOver = true;
    return true;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    // remove the cookie from the field, and list and increase its counter
    
    Location pacmanLoc = locations.get(name);
    HashSet<Type> onLoc = getLoc(pacmanLoc);
    if(gonLoc.contains(Map.Type.COOKIE)){   
    	cookies++;
	String cookieName= "tok_x"+pacmanLoc.x+"_y"+pacmanLoc.y; //cookie ID
	onLoc.remove(Map.Type.COOKIE); //removes cookie from the hashset of stuff on the current location
	field.put(pacmanLoc,onLoc);// replaces the field with the above set without the cookie
	locations.remove(cookieName);//removes the cookie from the locations
	return components.remove(cookieName); //removes and returns the cookie component

    } else {
	return null;
    }
  }
}
