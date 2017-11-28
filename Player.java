public abstract class Player{


//Class ATTRIBUTES
  
  public Room Position; // Position(x,y)
  public static Thing Inventory; //Inventory
  
  
 // Player object
  public Player (Room Position) 
  {this.Position = Position;}
  
  
  // Method Despawn
  public void Despawn(){
    this.Inventory.Drop(this.Position);
    this.Position = null;
    // * * * * * Drop inventory (must do)* * * * *
  }
  
  
}//CLASS END 