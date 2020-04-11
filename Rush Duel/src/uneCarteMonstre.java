
public class uneCarteMonstre extends uneCarte {

	private String requirement;
	private String attribut;
	private String type;
	private boolean effet;
	private String extraType;
	public uneCarteMonstre(String nom, String textEffet, String genre, String ExtraType,
			String requirement, String attribut, String type) {
		super(nom, textEffet, genre, ExtraType);
		this.requirement = requirement;
		this.attribut = attribut;
		this.type = type;
		this.effet = true;
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
	public String getExtraType() {
		return extraType;
	}
	public void setEffet() {
		this.effet = false;
	}
	
	
}
