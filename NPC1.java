public class NPC1 extends NPC{
  
  //NPC1 Object
  public NPC1(Room Position){
    super(Position);
    int[] blah = {-1,-1};
    Inventory = new PorkChop(blah);
    }
  
  //Despawn plus give Pork Chop
  
  // Must change what is bellow for dialogue
  
  @Override
  public void Despawn(){
    
    super.Despawn();
    System.out.println("Shit's afoot here's a Pork chop.");
    
// * * * GIVE THIS GUY A PORKCHOP, Must Do * * * 
    
  }//Despawn close
  
}// CLASS END
