package letelice;

public class Letelica {
	protected String proizvodjac;
	protected String tip;
	protected int godinaProizvodnje;
	
	public Letelica(String proizvodjac, String tip, int godinaProizvodnje) {
		super();
		this.proizvodjac=proizvodjac;
		this.tip=tip;
		this.godinaProizvodnje=godinaProizvodnje;
	}
	public Letelica(String proizvodjac,String tip) {
		this.proizvodjac=proizvodjac;
		this.tip=tip;
		godinaProizvodnje=0;
	}
	public Letelica() {}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProivodjac(String noviProizvodjac) {
		if(noviProizvodjac=="BOEING" || noviProizvodjac == "AIRBUS") {
			this.proizvodjac = noviProizvodjac;
		}
		else 
			System.out.println("Greska");
	}
	public void Ispis() {
		
		System.out.println(proizvodjac + " " + tip + " " + godinaProizvodnje);
	}
}
