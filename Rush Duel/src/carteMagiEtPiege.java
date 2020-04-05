
public class carteMagiEtPiege {

	private String nom;
	private String genre;
	private String type;
	private String Effet;
	
	public carteMagiEtPiege(String nom, String genre, String type, String effet) {
		this.nom = nom;
		this.genre = genre;
		this.type = type;
		this.Effet = effet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEffet() {
		return Effet;
	}

	public void setEffet(String effet) {
		Effet = effet;
	}
	
}
