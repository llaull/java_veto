package veterinaire;

public class Chat extends Animal{
    
    //this.nourriture = "croquette";
    
   public Chat(){}

   @Override
   public String seNourrir(String nourriture){
       return setNourriture("croquette");
   }
//public class Chat implements Animal{
    
  /*  public void seNourrir(){
        System.err.println("corquette");        
    }*/


    
    
}
