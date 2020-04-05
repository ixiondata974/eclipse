
public class Terrain {

	private Deck mainDeck, Main, Cimetiere, ExtraDeck;
	private carteMagiEtPiege zoneMonstre1, zoneMonstre2, zoneMonstre3;
	private carteMagiEtPiege zoneMagiPiege1, zoneMagiPiege2, zoneMagiPiege3;
	private carteMagiEtPiege zoneMagiTerrain;
	
	public Terrain(Deck mainDeck) {
		this.mainDeck = mainDeck;
		this.Main = null;
		this.Cimetiere = Cimetiere;
		this.zoneMagiPiege1 = null;
		this.zoneMagiPiege2 = null;
		this.zoneMagiPiege3 = null;
		this.zoneMonstre1 = null;
		this.zoneMonstre2 = null;
		this.zoneMonstre3 = null;
		this.zoneMagiTerrain = null;
	}
	
}
