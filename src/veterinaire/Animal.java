package veterinaire;

//public interface Animal{
public abstract class Animal{

    public void dormir(){
        System.out.println("je dors... comme tout le monde");
    }
   
    public void manger(){
        System.out.println("je mange... comme tout le monde");
    }
    
    public void mangerDyna(String nourriture){
        System.out.println("je mange..." + nourriture);
    }
    
    abstract void seMontrer();
    
}

