package letelice;

public class Helikopter extends Letelica {
	private boolean spasilacki;
	
	public Helikopter(String proizvodjac, String tip, int godinaProizvodnje,boolean spasilacki) {
		super(proizvodjac,tip,godinaProizvodnje);
		this.spasilacki=spasilacki;
	}
	public boolean Padobran(){
		if(godinaProizvodnje > 2000 && spasilacki)
			return true;
		else
			return false;
	}
	
}
