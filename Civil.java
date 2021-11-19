public class Civil extends Personnage implements Bataille{
    public Civil(String n, String p, int a){
        super(n,p,a);
    }
    
    public void soigner(){
        System.out.println("On me soigne si je suis blessé");
    }
    
}