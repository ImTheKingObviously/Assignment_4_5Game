public abstract class Player{


//Class ATTRIBUTES
  
  public int[] Position; // Position(x,y)
  private Thing Inventory; //Inventory
  

  // Player object
  public Player ( int[] Position) 
  {  this.Position = Position;}
  
  
  // Method Despawn
  public void Despawn(){
    this.Position = null;
  // * * * * * Drop inventory (must do)* * * * *
  }
  
 
}
