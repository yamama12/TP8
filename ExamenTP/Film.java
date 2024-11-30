package ExamenTP;

public class Film extends Evenement{
	private String producteur;
	private String genre;
	

	public Film(String titre, int duree, String[] tab, String realisateur, String producteur, String genre) {
		super(titre, duree, tab, realisateur);
		this.producteur = producteur;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Film [producteur=" + producteur + ", genre=" + genre + "]";
	}
	public String getProducteur() {
		return producteur;
	}
	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
