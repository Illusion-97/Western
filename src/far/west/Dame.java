package far.west;

public class Dame extends Humain implements Visage_Pale {
    private String couleurRobe;
    private boolean captive;

    public Dame(String nom) {
        super(nom);
        couleurRobe = "blanche";
        super.setBoisson("Lait");
    }

    @Override
    public String quel_est_ton_nom() {
        return "Miss " + super.quel_est_ton_nom();
    }

    @Override
    public void scalpe() {
        super.parler("Aïe ma tête !");
    }

    public void kidnappee(){
        super.parler("AAAAAHHHH !!!!LACHEZ MOI ESPECE DE ######### !\n A L'AAAIIIIIIIDDEEEE BANDE DE $$$$$$$$$$$$");
        captive = true;
    }

    public void libereeDelivree(Cowboy liberator){
        captive = false;
        super.parler("Je vous remercie mon cher " + liberator.quel_est_ton_nom() + ". \n ... \n Vous êtes encore la ?! Vous n'esperez tout de même pas une récompense ? Si ?!");
    }

    public void changerDeRobe(String uneCouleur){
        couleurRobe = uneCouleur;
        super.parler("Regardez ma nouvelle robe " + couleurRobe + " !");
    }

    public boolean isCaptive() {
        return captive;
    }
}
