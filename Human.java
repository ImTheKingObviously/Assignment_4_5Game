public class Human extends Fighting{

//   * * * SUPERS * * *
  public Human(int[] Position){super(Position);}

  public void Pickup(Thing item){
  
    if(item.isfood){this.HP += item.Despawn();}
    else{this.DMG += item.Despawn();}
    
  }


}// Class close Squiggly