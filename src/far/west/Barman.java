package far.west;

public class Barman extends Humain{
    private String bar;

    public Barman(String nom) {
        super(nom);
        super.setBoisson("Vin");
        bar = "Chez " + nom;
    }

    public Barman(String nom, String bar) {
        super(nom);
        super.setBoisson("Vin");
        this.bar = bar;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("Bienvenue " + bar);
    }

    @Override
    public void parler(String texte) {
        super.parler(texte + " Coco.");
    }

    public void servir(Humain unHumain){
        unHumain.parler("Barman ! Un verre !");
        System.out.println(super.quel_est_ton_nom() + " sert un verre de " + unHumain.getBoisson() + " à " + unHumain.quel_est_ton_nom());
        unHumain.parler("Parfait patron ! Mon préféré comme toujours !");
    }
}
