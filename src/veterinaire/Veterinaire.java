package veterinaire;


public class Veterinaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Animal monChat = new Chat();
       Animal monChien = new Chien();
       
       Animal monChat2 = new Chat();
       
       monChat.dormir();
       monChat.manger();
       
       monChat2.mangerDyna("");
       monChien.dormir();
       monChien.seMontrer();
       
       Veterinaire veto = new Veterinaire();       
       veto.soigner(monChat);
    }
    
    public void soigner(Animal a){
        System.out.println("je soigne " + a.getClass());
    }

}
