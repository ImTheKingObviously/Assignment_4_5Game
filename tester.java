public class tester {

  public static void main(String[] args){
  
    int[] dumblist = {1, 2};
    
    DoucheBag1 E1= new DoucheBag1(dumblist) ;
    DoucheBag2 E2= new DoucheBag2(dumblist) ;
  
    while ( E1.HP > 1 && E2.HP > 1 ){
    E1.Fight(E2);
    System.out.println("E1: "+ E1.HP);//testing it
    }
    
    System.out.println("end of Test");
  
  }//Main close

}//class close squigly