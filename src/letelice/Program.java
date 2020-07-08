package letelice;

public class Program {

	public static void main(String[] args) {
		Avion a1 = new Avion("AIRBUS","putnicki",2005,50,20);
		Avion a2 = new Avion("AIRBUS", "turisticki", 2001, 30, 10);

        a1.Ispis();
        a2.Ispis();

        Helikopter h1 = new Helikopter("BOEING", "sluzbeni", 2001, true);
        System.out.println(h1.Padobran());
        System.out.print(h1);

	}

}
