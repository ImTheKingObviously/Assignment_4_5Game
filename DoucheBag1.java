public class DoucheBag1 extends Enemy{

  
  public DoucheBag1(Room Position){
    
  //Initialization
    super(Position);
    this.HP = 20;
    this.DMG = 2;
    this.Worth = 2;
  
  
  
  }//Public Douchebag1 close

  public void Despawn(){
    super.Despawn();
    System.out.println("Douchebag1 passes out from drinking too much. ");
  }
}