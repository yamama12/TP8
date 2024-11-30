package ExamenTP;

import java.util.Arrays;

public class Evenement {
	private String titre;
	private int duree;
	private String tab[];
	private String realisateur;
	
	public Evenement(String titre, int duree, String[] tab, String realisateur) {
		this.titre = titre;
		this.duree = duree;
		this.tab = tab;
		this.realisateur = realisateur;
	}
	
	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", tab=" + Arrays.toString(tab) + ", realisateur="
				+ realisateur + "]";
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	
	public boolean acteurIn(String s) {
		boolean test=false;
		for (int i=0;i<tab.length;i++) {
			if (tab[i].equals(s)) {
				test=true;
			}
			else {
				test=false;
			}
		}
		return test;
		
	}

}
