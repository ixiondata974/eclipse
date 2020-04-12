
public class uneCarteMonstre extends uneCarte {

	private String requirement;
	private String attribut;
	private String type;
	private boolean effet;
	private boolean Syntho;
	private int niveau;
	
	public uneCarteMonstre(String nom, String textEffet, String genre, String ExtraType,
			String requirement, String attribut, String type, int Niveau) {
		super(nom, textEffet, genre, ExtraType);
		this.requirement = requirement;
		this.attribut = attribut;
		this.type = type;
		this.effet = true;
		this.niveau = Niveau;
		this.Syntho = false;
	}
	public String getAttribut() {
		return attribut;
	}
	public void setAttribut(String attribut) {
		this.attribut = attribut;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setEffet() {
		this.effet = false;
	}
	public void setSyntho() {
		this.Syntho = true;
	}
	
}
