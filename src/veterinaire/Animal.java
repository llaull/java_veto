package veterinaire;

//public interface Animal{
abstract class Animal{

    private String nourriture = "";
    
    public String getNourriture(){
        return nourriture;
    }
    
    public void setNourriture(String nou){
        nourriture = nou;
    }
    
     public String seNourrir(String nourriture){
        return System.out.println("1 mange : "+ nourriture);        
    }
   
}

