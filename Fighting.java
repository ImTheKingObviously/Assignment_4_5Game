public abstract class Fighting extends Player{

  //CLASS ATTRIBUTES
  public int HP; // Health Points
  public int DMG; //Damage
  
  
//  * * * SUPERS * * *
  public Fighting(Room Position){super(Position);}


//  Fight Method
  public void Fight(Fighting f1){
    
    // Damaging in fight
    f1.HP -= this.DMG;
    this.HP -= f1.DMG;
    
    // Once player is Dead
    if (f1.HP < 1){f1.Despawn();}
    if (this.HP < 1){this.Despawn();}
  
  }
  
}