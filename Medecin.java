public class Medecin extends Personnage implements Bataille{
    public Medecin(String n, String p, int a){
        super(n,p,a);
    }

    public void combattre(){
        System.out.println("Vive les scalpels");
    }
    public void soigner(){
        System.out.println("Je soigne les blessés");
    }
    
}