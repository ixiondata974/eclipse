import java.util.ArrayList;
import java.util.List;

public class Partie {

	public static void main(String[] args) {
		List<uneCarte> leDeck = new ArrayList();
		leDeck.add(new uneCarte("Polymerization","Invoquez par fusion un monstre","magie","normal"));
		leDeck.add(new uneCarte("Intéruption Raigeki","Envoyer une carte au cimetière. Détruisez une carte sur le terrein","Piege","normal"));
		leDeck.add(new uneCarteMonstre("Perçâme samourai supra-lourd","1-Le monstre équipé fait des dommages perçants.\n 2-Prennez un monstre samourai supralourd de votre deck à votre main",
				"Monstre","Normal","1-Vous pouvez équiper cette carte à un monstre samourai supra-lourd"
						+ "\n 2-Doit être envoyé au cimetière","Terre","Machine", 4));
		leDeck.add(new uneCarteMonstre("Ninja furtif samourai supra-lourd","1-Cette carte peut attaquer en mode défense.\n 2-Cette carte peut attaquer directement votre adversaire",
				"Monstre","Synchro","1-En mode défense utilisez ses statistiques de défense comme statistique de combat."
						+ "\n 2-Divisez la défense de cette carte par deux","Terre","Machine", 7));
		uneCarteMonstre unSyntho = new uneCarteMonstre("Flûtiste samourai supra-lourd","Aucun",
				"Monstre","Normal","Aucun","Terre","Machine", 4);
		unSyntho.setEffet();
		unSyntho.setSyntho();
		leDeck.add(unSyntho);
		
		Deck monDeck = new Deck(leDeck);
		Terrein unTerrein = new Terrein(monDeck);
		System.out.println(monDeck.getCarteDeck(3).getNom());
		System.out.println(unTerrein.getExtraDeck().getExtraMonstre().get(0).getNom());
	}

}
