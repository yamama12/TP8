package ExamenTP;

public class OrgniseEvtMois {
	private int mois ;
	private ThemeEvt theme;
	private Evenement T[];
	
	public int nbMax() {
		int nb=0;
		if (mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12) {
			nb=31;
		}
		else {
			if (mois==2) {
				nb=28;
			}
			else {
				nb=30;
			}
		}
		return nb;
	}
	
	public OrgniseEvtMois(int mois, ThemeEvt theme) {
		this.mois = mois;
		this.theme = theme;
		T=new Evenement[nbMax()];
	}
	
	public void ajouter (Evenement Evt, int jour) throws EvtException  {
		int i;
		if (theme.theme(Evt)==true) {
			if (jour<1 || jour> nbMax()) {
				throw new EvtException("Jour incorrecte");
			}
			else {
				if (T[jour-1]==null) {
					T[jour]=Evt;
				}
				else {
					for (i=0;i<nbMax();i++) {
						if (T[i]==null) {
							T[i]=Evt;
							break;
						}
					}
					if(i==nbMax()) {
						throw new EvtException ("Complet");
						
					}
				}
			}
		}
		else {
			System.out.println("theme invalide");
		}
	}
	
	
	public void afficherCalendrierEvts() {
		for (int i=0;i<nbMax();i++) {
			if (T[i]==null) {
				System.out.println(toString());
			}
		}
	}
	

}
