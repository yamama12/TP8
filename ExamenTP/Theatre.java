package ExamenTP;

public class Theatre extends Evenement{
	private String auteur;

	

	public Theatre(String titre, int duree, String[] tab, String realisateur, String auteur) {
		super(titre, duree, tab, realisateur);
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Theatre [auteur=" + auteur + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	

	
}
