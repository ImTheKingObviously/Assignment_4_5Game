public abstract class Thing {

  public int[] position = new int[2];
  public boolean isfood = false;
  
  public Thing(int[] pos){
    this.position = pos;
  }
  
  public String ShowName(){
  
    return "Generic Thing";
  
  }
  
  public int Despawn(){
  
    this.position[0] = -1;
    this.position[1] = -1;
    return 0;
    
    //Food is eaten immediately and returns the HP restored (if (item.isfood){this.HP += item.Despawn;})
    //Everything else returns a value which is added to the player's damage (else{this.DMG += item.Despawn; ***add to inventory***;})
    //The key and the goal item return 0
    
  }
  
  public void Drop(int[] pos){
    
    //pos will be the character's positon. Add to Player.
    
    this.position = pos;
    
    System.out.println("A " + this.ShowName() + " fell to the floor.");
    
  }
 
  //Pickup() must be added to Human, and call Despawn on the item being picked up
  
}