public class DoucheBag2 extends Enemy{

  
  public DoucheBag2(int[] Position){
    
  //Initialization
    super(Position);
    this.HP = 10;
    this.DMG = 1;
    this.Worth = 1;
  
  
  
  }//Public Douchebag2 close

  public void Despawn(){
    super.Despawn();
    System.out.println(" Douchebag2 cries and runs away.");
  }
}