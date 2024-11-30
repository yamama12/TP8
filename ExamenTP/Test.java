package ExamenTP;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThemeArtiste ta=new ThemeArtiste("Mohamed");
		String tArtistes1[]= {"Ahmed","Salah","Mohamed"};
		String tArtistes2[]= {"Sana","Imene","Mouna"};
		OrgniseEvtMois MJuillet=new OrgniseEvtMois(7,ta);
		try {
		Evenement e1= new Film("Film1",2 , tArtistes1, "Sami", "Youssef", "action");
		MJuillet.ajouter(e1, 8);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		try {
		Evenement e2= new Film("Film2",1 , tArtistes2, "Dalel", "Asma", "Drame");
		MJuillet.ajouter(e2, 27);
		}catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		try {
			Evenement e3=new Theatre("theatre1", 3, null, "Nour", "Mohamed");
			MJuillet.ajouter(e3, 80);
		}
		catch (Exception e3){
			System.out.println(e3.getMessage());
		}
		
		MJuillet.afficherCalendrierEvts();
        
	}

}
