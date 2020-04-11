import java.util.List;

public class Deck {

	private List<uneCarte> lesCartes;
	private List<uneCarte> extraMonstre;
	
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
	
}
