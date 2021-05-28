package far.west;

public class Histoire {

    public static void main(String[] args) {
	Brigand moi = new Brigand("Shekay");
	moi.setBoisson("Rhum Damoiseau");

	Dame fleur = new Dame("Fleur");
	fleur.sePresenter();

	moi.kidnapper(fleur);
	moi.sePresenter();

	Cowboy Clint = new Sherif("Clint");
	Clint.sePresenter();
	((Sherif)Clint).rechercher(moi,5000);

	Barman david = new Barman("David");
	david.sePresenter();
	david.servir(Clint);
	david.servir(moi);

	Clint.tirer(moi);
	((Sherif)Clint).capturer(moi);
	Clint.liberer(fleur);

	Femme_Brigand Jane = new Femme_Brigand("Jane");
	Jane.sePresenter();
	Jane.kidnapper(fleur);
	Clint.tirer(Jane);
	((Sherif) Clint).capturer(Jane);


    }
}
