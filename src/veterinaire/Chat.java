package veterinaire;

public class Chat extends Animal{

    @Override
    public void dormir(){
        System.out.println("je dors... 18h par jours");
    }
    
    @Override
    public void mangerDyna(String nourriture){
        nourriture = "croquette";
        super.mangerDyna(nourriture);
        
    }

    @Override
    void seMontrer() {
        System.out.println("je suis un chat noir");
    }
        
}