import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<uneCarte> lesCartes = new ArrayList<>();
	private List<uneCarte> extraMonstre;
	private List<uneCarte> laMain;
	
	public Deck(List<uneCarte> lesCarte) {
		this.lesCartes = lesCarte;
		List<uneCarte> ExtraMonstre = new ArrayList<>();
		for(int i = 0; i<lesCartes.size(); i++) {
			if(lesCartes.get(i).getExtra() == "Synchro" || 
					lesCartes.get(i).getExtra() == "Fusion" ||
					lesCartes.get(i).getExtra() == "Xyz" ) {
				ExtraMonstre.add(lesCartes.get(i));
				lesCartes.remove(i);
			}
		}
		this.extraMonstre = ExtraMonstre;
	}
	
	public List<uneCarte> getExtraMonstre() {
		return extraMonstre;
	}
	
	public List<uneCarte> getLaMain() {
		return laMain;
	}

	public void setMainDebut() {
		for(int i = 0; i<4; i++) {
			laMain.add(lesCartes.get(i));
			lesCartes.remove(i);
		}
	}
	
	public uneCarte getCarteDeck(int i) {
		return lesCartes.get(i);
	}
	
	public void pioche() {
		laMain.add(lesCartes.get(0));
		lesCartes.remove(0);
	}
}
