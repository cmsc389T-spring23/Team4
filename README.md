# Pacman Game

## Tom Dai, Jason Soo, Kane Hsu, Alexander Pastor

![alt](./Projects/P2/app/src/main/resources/start.png)
![alt](./Projects/P2/app/src/main/resources/game.png)
### Running the Game
1. Navigate to the P2 directory
2. Make sure Gradle is installed, then run:
```bash
gradle build
gradle run
```

If you are using Powershell use:
```bash
.\gradlew build
.\gradlew run
```
3. Enjoy!

## PacMan Class

### get_valid_moves

### move

- **Implementation**: This method creates a list of valid moves, and randomly chooses one of the moves in that list, using `Math.random()`. The method returns true if the `Map.move()` call returns true, or false otherwise.
- **Testing**: A simple test was created to test the movement of Pacman. A Pacman is created at location (0, 0) in an empty map, and `move()` is called on Pacman five times, and checks if it returns true each time.

### is_ghost_in_range
- **Type**: `() -> Bool`
- **Implementation**: This method scans a 3x3 grid of locations with pacman at the center. If any ghost is within the bounds of this grid, this method returns true and returns false otherwise.
- **Testing**: Two tests were created. The first one creates a pacman at location (10,10), a ghost at location (9,9), and ensures is_ghost_in_range() returns true. The second test creates a pacman at location (1,1), a ghost at location (3,3) and makes sure is_ghost_in_range() returns false.

### consume
- **Type** `() -> JComponent`
- **Implementation**: This method will check to see if pacman is able to eat nearby cookies and will return the cookie component if so, and null otherwise. It uses the Map.getLoc method to get a hashset of components at Pacman's locations to see if there is a cookie there. If so, pacman will call the Map.eatCookie method and will return a cookie component.
- **Testing**: For Testing, I initalized a frame with pacman and a cookie at the same location. I called the consume method and checked to see if the method returned a cookie component and incremented the score in the frame's map. Then I called the consume method gain, to see if the cookie was fully removed from the map and checked to see if the method returned null a second time. Additionally I also checked to see that this second call did not increment the score. 

## Ghost Class

### get_valid_moves

### ghost-move

- **Implementation**: Similar to `Pacman.move()`, `Ghost.move()` creates a list of valid moves, and randomly picks a move to go to using `Math.random()`. The method returns true if the `Map.move()` call returns true, and false otherwise.
- **Testing**: Similar to `Pacman.move()`, a simple test was created to test the movement of a ghost. A ghost is created at location (0, 0), and `move()` is called on the ghost five times, and should return true each time.

### is_pacman_in_range
- **Type**: `() -> Boolean` 
- **Implementation**: This method scans a 3x3 grid of locations with the ghost at the center. If pacman is within this grid, is_pacman_in_range() will return true and will return false otherwise.
- **Testing**: The first test creates a pacman and a ghost one cell apart from each other and ensures that is_pacman_in_range() returns true. The second test places a pacman and a ghost 2 cells apart and ensures that is_pacman_in_range() returns false.

### attack
- **Type**: `() -> Boolean` 
- **Implementation**: This method will call Ghost.is_pacman_in_range method to see if pacman is in range of the ghost, if so it will return Map.attack, and false otherwise.
- **Testing**: For Testing I initalized two frames, one with a ghost near pacman, and one that had a ghost far from pacman. I called ghost.attack for both and tested for true and false respectively.

## Map Class

### move

### getLoc
- **Implementation**: `Map.getLoc()` returns the set of types on the field. The method creates a set and adds all of the types in the location `loc` from the hashmap `field`.
- **Testing**: A simple test was created to test `Map.getLoc()`. A Pacman is created at location (0, 0), and `getLoc` is called on the location (0, 0) to check if a Pacman type is present at that location.

### attack
- **Type**: `() -> Boolean` 
- **Implementation**: This method is called when is_pacman_in_range() returns true in Ghost.attack() and returns whether or not the attack was succesful.
- **Testing**: The first test is testing for diagonal attacks. The second test places a ghost out of range of pacman and ensures that the attack will fail. The third test is making sure an attack works when pacman and ghost are next to each other.

### eatCookie
- **Type**: `(String name) -> JComponent`
- **Implementation**: This method takes in a string for pacman's name and will determine if pacman is able to eat a cookie on the map. If so, it will return the cookie component, remove that cookie's location from the field, remove it from the compnents list, and remove its location from the list of locations. It will also increment the score by one. It will return null if it doesn't find a cookie at pacman's location.
- **Testing**: The testing for this method is very similar to pacman's consume in that create a frame where pacman spawns ontop of a cookie and we call the eatCookie method to check to see if he returns a component, and if the score is incremented. If we call it a second time, we also indirecly check to see if the fields are removed and we check for null once the method returns. Additionally we also check and make sure the score is not incremented as pacman is not suppose to eat a cookie on the second method call.
