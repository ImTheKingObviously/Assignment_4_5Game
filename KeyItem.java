public abstract class KeyItem extends Thing{

  public boolean found = false;
  
  public KeyItem(Room pos){super(pos);}
  
  public int Despawn(){
  
  this.found = true;
  super.Despawn();
  return 0;
  
  }
  
}