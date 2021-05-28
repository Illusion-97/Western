package far.west;

public class Femme_Brigand extends Dame implements Hors_la_Loi{

    private int recompense = 100;
    private boolean enPrison = false;

    public Femme_Brigand(String nom) {
        super(nom);
    }

    @Override
    public void kidnapper(Dame uneDame) {
        super.parler("Ah ah ! " + uneDame.quel_est_ton_nom() + ", tu es mienne désormais !");
        uneDame.kidnappee();
    }

    @Override
    public void emprisonne(Cowboy unCowboy) {
        super.parler( "Damned, je suis fait ! " + unCowboy.quel_est_ton_nom() + ", tu m’as eu !");
        enPrison = true;
    }

    @Override
    public int getRecompense() {
        return recompense;
    }

    @Override
    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }
}
