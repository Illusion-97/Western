package far.west;

public class Indien extends Humain{
    private String totem;
    private int nbPlumes;

    public Indien(String nom) {
        super(nom);
        super.setBoisson("Vin");
        totem = "Coyotte";
        nbPlumes = 0;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("Je dispose de " + nbPlumes +" plumes !");
        parler("Mon animal totem est le  " + totem +" !");
    }

    @Override
    public void parler(String texte) {
        super.parler(texte + " Ugh !");
    }

    public void scalp(Visage_Pale unHumain){
        parler("Je te tiens Visage-Pale !");
        unHumain.scalpe();
        nbPlumes++;
    }
}
