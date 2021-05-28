package far.west;

public class Humain {
    private String nom;
    private String boisson = "eau";

    public Humain(String nom) {
        this.nom = nom;
    }

    public void parler(String texte) {
        System.out.println("( " + nom + " ) - " + texte);
    }

    public void sePresenter() {
        parler("Bonjour ! Je suis " + quel_est_ton_nom() + " ! Ah ! un bon verre d" + boisson + " ! GLOUPS !");
    }

    public String quel_est_ton_nom(){
        return nom;
    }

    public String getBoisson() {
        return boisson;
    }

    public void setBoisson(String boisson) {
        this.boisson = boisson;
    }
}
