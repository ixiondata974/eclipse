import java.util.ArrayList;
import java.util.List;

public class Terrein {

	private uneCarte zoneMonstre1;
	private uneCarte zoneMonstre2;
	private uneCarte zoneMonstre3;
	private uneCarte zoneMagiePiege1;
	private uneCarte zoneMagiePiege2;
	private uneCarte zoneMagiePiege3;
	private uneCarte zoneMagieTerrein;
	private Deck leDeck;
	private Deck extraDeck;
	private Deck leCimetiere;
	private List<uneCarte> laMain = new ArrayList<>();
	
	public Terrein(Deck ceDeck) {
		this.zoneMagiePiege1 = null;
		this.zoneMagiePiege2 = null;
		this.zoneMagiePiege3 = null;
		this.zoneMonstre1 = null;
		this.zoneMonstre2 = null;
		this.zoneMonstre3 = null;
		this.zoneMagieTerrein = null;
		this.leCimetiere = null;
		this.leDeck = ceDeck;
		Deck lExtraDeck = new Deck(ceDeck.getExtraMonstre());
		this.extraDeck = lExtraDeck;
	}

	public void mainDebut() {
		for(int i = 0; i<4; i++) {
			laMain.add(leDeck.getCarteDeck(0));
			leDeck.removing(0);
		}
	}
	
//Getter et Setter......................................................
	
	public List<uneCarte> getLaMain() {
		return laMain;
	}

	public Deck getExtraDeck() {
		return extraDeck;
	}

	public void setZoneMonstre1(uneCarte zoneMonstre1) {
		this.zoneMonstre1 = zoneMonstre1;
	}

	public void setZoneMonstre2(uneCarte zoneMonstre2) {
		this.zoneMonstre2 = zoneMonstre2;
	}

	public void setZoneMonstre3(uneCarte zoneMonstre3) {
		this.zoneMonstre3 = zoneMonstre3;
	}

	public void setZoneMagiePiege1(uneCarte zoneMagiePiege1) {
		this.zoneMagiePiege1 = zoneMagiePiege1;
	}

	public void setZoneMagiePiege2(uneCarte zoneMagiePiege2) {
		this.zoneMagiePiege2 = zoneMagiePiege2;
	}

	public void setZoneMagiePiege3(uneCarte zoneMagiePiege3) {
		this.zoneMagiePiege3 = zoneMagiePiege3;
	}

	public void setZoneMagieTerrein(uneCarte zoneMagieTerrein) {
		this.zoneMagieTerrein = zoneMagieTerrein;
	}
	
}
