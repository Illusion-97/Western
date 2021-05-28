package far.west;

public class Cowboy extends Humain implements Visage_Pale{
    private int popularite = 0;
    private String adjectif = "vaillant";

    public Cowboy(String nom) {
        super(nom);
        super.setBoisson("Whisky");
    }

    public void tirer(Hors_la_Loi unBrigand){
        System.out.println("Le " + adjectif + " " + super.quel_est_ton_nom() + " tire sur "+ unBrigand.quel_est_ton_nom() + ". PAN !");
        super.parler("Prend ca, ¸ rascal !");
    }

    public void liberer(Dame uneDame){
        super.parler("Vous voila délivrée charmante créature!");
        uneDame.libereeDelivree(this);
        popularite++;
    }

    @Override
    public void scalpe() {
        super.parler("Aïe ma tête !");
    }
}
