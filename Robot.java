public class Robot
{
    private int pvie;
    private String nom;

    Robot(String nom){
        if(nom.equals("")){
            System.out.println("Entrer le nom du robot");
            System.exit(1);
        }
        this.nom = nom;
        this.pvie = 10;
    }

    public int getPvie() {
        return pvie;
    }

    public void setPvie(int pvie) {
        this.pvie = pvie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  void fire(Robot Ro){
        if(!Ro.isDead() ){
            Ro.setPvie(Ro.getPvie() - 2);
            System.out.println("Robot "+ this.nom + " a touche Robot " + Ro.nom +" !");
        }
    }

    public boolean isDead(){
        return (this.getPvie() == 0);
    }

    @Override
    public String toString(){
        return  "Robot "+this.getNom();
    }
}
