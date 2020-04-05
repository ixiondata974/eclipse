
public class CarteMonstre extends carteMagiEtPiege {
	
	private int niveau;
	private String requirement;
	private String attribut;
	private Boolean synto;
	
	public CarteMonstre(String nom, String genre, String type, String effet, int niveau, String attribut, Boolean isSynto) {
		super(nom, genre, type, effet);
		this.niveau = niveau;
		this.requirement = requirement;
		this.attribut = attribut;
		this.synto = isSynto;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getAttribut() {
		return attribut;
	}

	public void setAttribut(String attribut) {
		this.attribut = attribut;
	}
	
	public void setSynto() {
		if(this.synto == false) {
			this.synto = true;
		}
	}
}
