package letelice;

public class Avion extends Letelica {
	private int brSedista;
	private int ukupanBrRedova;
	public Avion(String proizvodjac, String tip, int godinaProizvodnje,int brSedista,int ukupanBrRedova){	
		super(proizvodjac,tip,godinaProizvodnje);
		this.brSedista=brSedista;
		this.ukupanBrRedova=ukupanBrRedova;
	}
	public int getBrSedista(){
		return brSedista;
	}
	public void setBrSedista(int noviBrSedista) {
		this.brSedista=noviBrSedista;
	}
	public int UkupanBrojSedista() {
		return brSedista * ukupanBrRedova;
	}
	public void Ispis() {
		super.Ispis();
		System.out.println(brSedista + " " + ukupanBrRedova + " " + UkupanBrojSedista());
	}
}
