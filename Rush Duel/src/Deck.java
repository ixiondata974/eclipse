import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<uneCarte> lesCartes;
	private List<uneCarte> extraMonstre;
	private List<uneCarte> laMain;
	
	public Deck(List<uneCarte> lesCarte) {
		this.lesCartes = lesCarte;
		for(int i = 0; i<=lesCartes.size(); i++) {
			if(lesCartes.get(i).getExtra() == "Synchro" || 
					lesCartes.get(i).getExtra() == "Fusion" ||
					lesCartes.get(i).getExtra() == "Xyz" ) {
				lesCartes.remove(i);
				extraMonstre.add(lesCartes.get(i));
			}
		}
		this.extraMonstre = extraMonstre;
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
	
	public void pioche() {
		laMain.add(lesCartes.get(0));
		lesCartes.remove(0);
	}
}
