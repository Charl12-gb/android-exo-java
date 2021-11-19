public class Guerrier extends Personnage implements Bataille{
    public Guerrier(String n, String p, int a){
        super(n,p,a);
    }

    public void combattre(){
        System.out.println("Fusil, pistolet et tout ce que tu veux");
    }
    
}