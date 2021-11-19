public abstract class Personnage{
    protected String nom;
    protected String prenom;
    protected int age;

    public Personnage(String n, String p, int a){
        this.nom = n;
        this.prenom = p;
        this.age = a;
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getAge(){
        return age;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void deplacer(){
        System.out.println("Je me déplace à pieds");
    }
    public void combattre(){
        System.out.println("Je ne combats pas");
    }
    public void soigner(){
        System.out.println("Je ne soigne pas");
    }
    public String decrisToi(){
        return "\t Je m'appelle "+this.nom+" "+this.prenom+ " et j'ai "+this.age;
    }
}