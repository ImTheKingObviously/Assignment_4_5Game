public class Human extends Fighting implements Movement{

//  CLASS ATTRIBUTES
  public int LVL = 1;
  public int XP = 0;
  
//   * * * SUPERS * * *
  public Human(Room Position){
    
    super(Position);
    this.HP = 25;
    this.DMG = 1;
  }
    
  public void Pickup(Thing item){
    
  // THIS CONVERTS BONUS TO THINGS IN PLAYER CLASS
    if(item.isfood){this.HP += item.Despawn();}
    else{this.DMG += item.Despawn();}
  
  }//Closes Human Object

  //Game over If player dies
  public void Despawn(){
  System.out.println(" fuckin noob. You suck. GG ");
  System.exit(0);// ENDs Game
  }
  
  public void Fight(Fighting f1){
    super.Fight(f1);
  System.out.println("You dealt " + this.DMG + " damage, and your current HP is " + this.HP + ".");
  }
 
    public int[] move(String dir, int[] pos){
    int x = pos[0];
    int y = pos[1];
    if(dir == "N"){
      y -= 1;
    }
    if(dir == "S"){
      y += 1;
    }
    if(dir == "W"){
      y -= 1;
    }
    if(dir == "E"){
      y += 1;
    }
    int[] a = {x, y};
    return a;
  }


}// Class close Squiggly