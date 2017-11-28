public class Room{

  //Rooms adjacent to this one. In the form of [North, East, South, West].
  public Room[] AdjacentRooms = new Room[4];
  
  //roomtype indicates whether it is a normal room (0), an entrance (1) or a goal room (2)
  //its purpose is both for pathfinding to the entrance, and to check whether a key is needed, or the game ends when you enter the room
  public int roomtype = 0;
  
  //room's x/y location
 // public int[] Location = new int[2];
  
  //people in the room
  public Player[] Players = new Player[2];
  
  //item in the room
  public Thing item;
  
  //constructor if there is a player in the room
  public Room(Player player, Room[] adjacent){
  
  this.Players[0] = player;
  this.AdjacentRooms = adjacent;
  
  }
  
  //constructor for empty rooms
  public Room(Room[] adjacent){
  
  this.AdjacentRooms = adjacent;
  
  }
  
}