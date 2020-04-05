import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<carteMagiEtPiege> mainDeck;
	public Deck(List<carteMagiEtPiege> mDeck) {
		this.mainDeck = mDeck;
	}
	
	public List<carteMagiEtPiege> extraDeck(){
		List<carteMagiEtPiege> getExtraD = new ArrayList<>();
		for(int i = 0; i<mainDeck.size(); i++) {
			if(mainDeck.get(i).getGenre() == "Fusion" || 
					mainDeck.get(i).getGenre() == "Synchro" || 
					mainDeck.get(i).getGenre() == "Xyz") {
				getExtraD.add(mainDeck.get(i));
			}
		}
		return getExtraD;
	}
}
