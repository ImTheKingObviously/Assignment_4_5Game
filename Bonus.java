public abstract class Bonus extends Thing{

  public int bonus;
  
  public Bonus(Room pos){
  
  super(pos);
  
  }

  public int Despawn(){
  
  super.Despawn();
  return this.bonus;
  
  }

}