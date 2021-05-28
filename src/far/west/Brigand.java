package far.west;

public class Brigand extends Humain implements Hors_la_Loi,Visage_Pale {
    private String look = "mechant";
    private int nbDamesKidnappee = 0;
    private int recompense = 100;
    private boolean enPrison = false;

    public Brigand(String nom) {
        super(nom);
        super.setBoisson("Tord-Boyaud");
    }

    @Override
    public String quel_est_ton_nom() {
        return super.quel_est_ton_nom() + " le " + look;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        super.parler("J’ai l’air " + look +" et j’ai déjà kidnappé " + nbDamesKidnappee +" dames !");
        super.parler("Ma tête est mise à prix à " + recompense + " $ !");
    }

    @Override
    public void scalpe() {
        super.parler("Aïe ma tête !");
    }

    public void kidnapper(Dame  uneDame) {
        super.parler("Ah ah ! " + uneDame.quel_est_ton_nom() + ", tu es mienne désormais !");
        nbDamesKidnappee++;
        uneDame.kidnappee();
    }

    public void emprisonne(Cowboy  unCowboy){
        super.parler( "Damned, je suis fait ! " + unCowboy.quel_est_ton_nom() + ", tu m’as eu !");
        enPrison = true;
    }

    public boolean isEnPrison(){
        return enPrison;
    }

    public int getRecompense() {
        return recompense;
    }

    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }
}
