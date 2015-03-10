/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaire;

/**
 *
 * @author Arkesys
 */
public class Veterinaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal monChat = new Chat();
        
        System.out.print(monChat.getNourriture());
        System.out.println(monChat.seNourrir("s"));
        
    }
    
}
