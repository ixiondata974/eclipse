import java.util.ArrayList;
import java.util.List;

public class Partie {

	public static void main(String[] args) {
		List<uneCarte> leDeck = new ArrayList();
		leDeck.add(new uneCarte("Polymerization","Invoquez par fusion un monstre","magie","normal"));
		leDeck.add(new uneCarte("Int�ruption Raigeki","Envoyer une carte au cimeti�re. D�truisez une carte sur le terrein","Piege","normal"));
		leDeck.add(new uneCarteMonstre("Per��me samourai supra-lourd","1-Le monstre �quip� fait des dommages per�ants.\n 2-Prennez un monstre samourai supralourd de votre deck � votre main",
				"Monstre","Normal","1-Vous pouvez �quiper cette carte � un monstre samourai supra-lourd"
						+ "\n 2-Doit �tre envoy� au cimeti�re","Terre","Machine", 4));
		leDeck.add(new uneCarteMonstre("Ninja furtif samourai supra-lourd","1-Cette carte peut attaquer en mode d�fense.\n 2-Cette carte peut attaquer directement votre adversaire",
				"Monstre","Synchro","1-En mode d�fense utilisez ses statistiques de d�fense comme statistique de combat."
						+ "\n 2-Divisez la d�fense de cette carte par deux","Terre","Machine", 7));
		uneCarteMonstre unSyntho = new uneCarteMonstre("Fl�tiste samourai supra-lourd","Aucun",
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
