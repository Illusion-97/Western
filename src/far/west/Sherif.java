package far.west;

public class Sherif extends Cowboy{
    private int nbBrigandCapture = 0;

    public Sherif(String nom) {
        super(nom);
        super.setBoisson("Whisky");
    }

    @Override
    public String quel_est_ton_nom() {
        return "Sherif " + super.quel_est_ton_nom();
    }

    public void rechercher(Hors_la_Loi unBrigand, int recompense) {
        System.out.println("Le "+quel_est_ton_nom()+" placarde des affiches à tous les coins de rue en braillant :");
        super.parler("OYEZ OYEZ BRAVE GENS !! " + recompense + " $ à qui arretera " + unBrigand.quel_est_ton_nom() + " mort ou vif !!");
        unBrigand.setRecompense(recompense);
    }

    public void capturer(Hors_la_Loi unBrigand){
        super.parler("Au nom de la loi, je vous arrête !");
        unBrigand.emprisonne(this);
        nbBrigandCapture++;
    }
}
