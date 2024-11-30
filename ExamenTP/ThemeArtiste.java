package ExamenTP;

public class ThemeArtiste implements ThemeEvt{
	private String nomArtiste;
	
	

	public ThemeArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}



	@Override
	public boolean theme(Evenement Evt) {
		// TODO Auto-generated method stub
		boolean test=false;
		if (Evt instanceof Theatre) {
			if (Evt.acteurIn(nomArtiste)==true) {
				test=true;
			}
			else {
				if(Evt.getRealisateur().equals(nomArtiste)) {
					test=true;
				}
				else {
					if (((Theatre)Evt).getAuteur().equals(nomArtiste)){
						test=true;
					}
				}
			}
		}
		else {
			if (Evt instanceof Film) {
				if (Evt.acteurIn(nomArtiste)) {
					test=true;
				}
				else {
					if(((Film) Evt).getProducteur().equals(nomArtiste)) {
						test=true;
					}
					else {
						if(((Film)Evt).getRealisateur().equals(nomArtiste)){
							test=true;
						}
					}
				}
			}
		}
		return test;
	}
	

}
