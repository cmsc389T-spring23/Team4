# Pacman Game
## Tom Dai, Jason Soo, Kane Hsu, Alexander Pastor
[comment]: ADD IMAGE HERE, just paste the url of the imager in the ".." or its path if you upload the pic to the directory
![alt](..)
###Running the Game
1. Navigate to the P2 directory
2. Run the following command in the terminal:
```java
gradle run
```
##PacMan Class
###get_valid_moves
###move
###is_ghost_in_range
- **Type**: `() -> Bool`
- **Implementation**: This method scans a 3x3 grid of locations with pacman at the center. If any ghost is within the bounds of this grid, this method returns true and returns false otherwise.
- **Test Description**: Two tests were created. The first one creates a pacman at location (10,10), a ghost at location (9,9), and ensures is_ghost_in_range() returns true. The second test creates a pacman at location (1,1), a ghost at location (3,3) and makes sure is_ghost_in_range() returns false.
###consume

##Ghost Class
###get_valid_moves
###ghost-move
###is_pacman_in_range
###attack

##Map Class
###move
###getLoc
###attack
###eatCookie
