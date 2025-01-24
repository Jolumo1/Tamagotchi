package pack;

public class Tamagochi {

	public String nombre;
	public int hambre;
	public int sueno;
	public int higiene;
	public int diversion;
	public boolean vivo = true;

	public static int contadorTamagochi = 0;

	
	//constructores
	public Tamagochi(String nombre, int hambre, int sueno, int higiene, int diversion, boolean vivo) {

		this.nombre = nombre;
		this.hambre = hambre;
		this.sueno = sueno;
		this.higiene = higiene;
		this.diversion = diversion;
		this.vivo = vivo;

	}

	public Tamagochi(String nombre, int hambre, int sueno, int higiene, int diversion) {

		this.nombre = nombre;
		this.hambre = hambre;
		this.sueno = sueno;
		this.higiene = higiene;
		this.diversion = diversion;

	}

	public Tamagochi() {

	}

	//Metodos para funciones del programa, comer, dormir, etc...
	
	public void comer() {

		hambre = hambre + 20;
		if (hambre > 100) {
			hambre = 100;
			System.out.println("Has llegado al máximo que es 100");
		}
		sueno = sueno - 10;
		higiene = higiene - 10;
		diversion = diversion - 10;

		System.out.println("Acción ejecutada pero el resto de valores acaba de bajar 10 puntos");
		System.out.println();

		if (hambre <= 0 || higiene <= 0 || diversion <= 0 || sueno <= 0) {

			sueno = 0;
			higiene = 0;
			diversion = 0;
			hambre = 0;

			System.out.println("Este tamagochi acaba de morir");
			System.out.println();
			System.out.println("         -|-");         
			System.out.println("          |");
			System.out.println("      .-'~~~`-.");
			System.out.println("    .'         `.");
			System.out.println("    |  R  I  P  |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

			vivo = false;
		}
	}

	public void dormir() {

		sueno = sueno + 20;
		if (sueno > 100) {
			sueno = 100;
			System.out.println("Has llegado al máximo que es 100");
		}
		hambre = hambre - 10;
		higiene = higiene - 10;
		diversion = diversion - 10;

		System.out.println("Acción ejecutada pero el resto de valores acaba de bajar 10 puntos");
		System.out.println();

		if (hambre <= 0 || higiene <= 0 || diversion <= 0 || sueno <= 0) {

			sueno = 0;
			higiene = 0;
			diversion = 0;
			hambre = 0;

			System.out.println("Este tamagochi acaba de morir");
			System.out.println();
			System.out.println("         -|-");         
			System.out.println("          |");
			System.out.println("      .-'~~~`-.");
			System.out.println("    .'         `.");
			System.out.println("    |  R  I  P  |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

			vivo = false;
		}
	}

	public void higiene() {

		higiene = higiene + 20;
		if (higiene > 100) {
			higiene = 100;
			System.out.println("Has llegado al máximo que es 100");
		}
		hambre = hambre - 10;
		sueno = sueno - 10;
		diversion = diversion - 10;

		System.out.println("Acción ejecutada pero el resto de valores acaba de bajar 10 puntos");
		System.out.println();

		if (hambre <= 0 || higiene <= 0 || diversion <= 0 || sueno <= 0) {

			sueno = 0;
			higiene = 0;
			diversion = 0;
			hambre = 0;

			System.out.println("Este tamagochi acaba de morir");
			System.out.println();
			System.out.println("         -|-");         
			System.out.println("          |");
			System.out.println("      .-'~~~`-.");
			System.out.println("    .'         `.");
			System.out.println("    |  R  I  P  |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

			vivo = false;
		}
	}

	public void jugar() {

		diversion = diversion + 20;
		if (diversion > 100) {
			higiene = 100;
			System.out.println("Has llegado al máximo que es 100");
		}
		hambre = hambre - 10;
		sueno = sueno - 10;
		higiene = higiene - 10;

		System.out.println("Acción ejecutada pero el resto de valores acaba de bajar 10 puntos");
		System.out.println();

		if (hambre <= 0 || higiene <= 0 || diversion <= 0 || sueno <= 0) {

			sueno = 0;
			higiene = 0;
			diversion = 0;
			hambre = 0;

			System.out.println("Este tamagochi acaba de morir");
			System.out.println();
			System.out.println("         -|-");         
			System.out.println("          |");
			System.out.println("      .-'~~~`-.");
			System.out.println("    .'         `.");
			System.out.println("    |  R  I  P  |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("    |           |");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");

			vivo = false;
		}
	}

	// toString, setters and Getters
	
	@Override
	public String toString() {
		String auxVivo;
		if (vivo == false) {
			auxVivo = "Muerto";
		} else {
			auxVivo = "Vivo";

		}

		return "     Nombre: " + nombre + ", Hambre=" + hambre + ", Sueño=" + sueno + ", Higiene=" + higiene
				+ ", Diversion=" + diversion + ", Estado=" + auxVivo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHambre() {
		return hambre;
	}

	public void setHambre(int hambre) {
		this.hambre = hambre;
	}

	public int getSueno() {
		return sueno;
	}

	public void setSueno(int sueno) {
		this.sueno = sueno;
	}

	public int getHigiene() {
		return higiene;
	}

	public void setHigiene(int higiene) {
		this.higiene = higiene;
	}

	public int getDiversion() {
		return diversion;
	}

	public void setDiversion(int diversion) {
		this.diversion = diversion;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public static int getContadorTamagochi() {
		return contadorTamagochi;
	}

	public static void setContadorTamagochi(int contadorTamagochi) {
		Tamagochi.contadorTamagochi = contadorTamagochi;
	}

}
