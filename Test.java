public class Test{
    public static void main(String[] args){
        Bataille[] per = {new Medecin("GBO", "Char", 21), new Guerrier("GBO1", "Char", 21), new Civil("GBO2", "Char", 21)};
        for(Bataille p : per){
            System.out.println("Instance de : "+p.getClass().getName() );
            System.out.println("*******************************************");
            p.combattre();
            p.deplacer();
            p.soigner();
            System.out.println(p.decrisToi());
        }
    }
}