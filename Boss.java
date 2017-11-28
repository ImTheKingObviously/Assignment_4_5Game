public class Boss extends Enemy{

  
  public Boss(Room Position){
    
  //Initialization
    super(Position);
    this.HP = 100;
    this.DMG = 10;
    this.Worth = 100000000;
  
  
  
  }//Public Boss close

  public void Despawn(){
    super.Despawn();
    System.out.println(" Biggest Douche cries, you slice his head off with a spoon and put it in your inventory. ");
  }
  
  public void Fight(Fighting f1){
  super.Fight(f1);
  if(this.HP < 50){System.out.println("Boss takes out seringe with steroids and injects it into his bloodstream."+" his Damage dealt doubles in strenght! ");
    this.DMG = 20;}
  
  
  }
  
}