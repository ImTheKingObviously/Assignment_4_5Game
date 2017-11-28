import java.util.Scanner;

public class Riddler extends NPC{
  
  public Riddler(int[] Position){
    super(Position);
    this.DMG = 1;
  }
  
  
  
  // RIDDLE 
  @Override
  public void dialogue(){

    //Shit he needs to say
    Scanner key = new Scanner(System.in);
    System.out.println("What's 2 plus 2? ");
    
    while(4 != key.nextInt()){
      System.out.println( "dumbass, try again");
      if(4==key.nextInt()){this.Despawn();}// Despawn if they get riddle
    }//while wrong
    
    
    System.out.println("Yea im gonna disapear now, later b@$CH the door was right behind me the whole time. #Noob");

  }
  
}// end of clas