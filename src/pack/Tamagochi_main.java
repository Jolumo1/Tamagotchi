package pack;

import java.util.Scanner;

public class Tamagochi_main {

	public static Scanner entrada = new Scanner(System.in);
	public static Scanner entradaString = new Scanner(System.in);

	private static Tamagochi coleccion[] = new Tamagochi[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;

		do {
			opcion = menu();
			tratarOpcion(opcion);

		} while (opcion != 8);

	}// fin main

	public static boolean listarTamagochi() {

		// lista los tamagochis y devuelve true si hay alguno creado, o false en caso de
		// que no haya nada en el array. Se usará como comprobacion adicional en los
		// otros metodos.

		boolean listarOk = false;

		if (Tamagochi.contadorTamagochi == 0) {
			System.out.println("No hay ningún tamagochi en la colección");
		} else {
			listarOk = true;
			for (int i = 0; i < Tamagochi.contadorTamagochi; i++) {
				System.out.println("Tamagochi número: " + i);
				System.out.println(coleccion[i].toString());

			}
		}
		return listarOk;
	}

	public static void crearTamagochi() {

		// crea el objeto y lo carga en el array segun valores que entran por consola,
		// se tiene en cuenta que no sean negativos ni superiores a 100.
		// se tiene en cuenta la capacidad del carray

		String nombre;
		int hambre = 0, sueno = 0, higiene = 0, diversion = 0;
		boolean flagMenu = true; // para los try catch

		if (Tamagochi.contadorTamagochi > coleccion.length - 1) {
			System.out.println("La colección está llena");
		} else {

			System.out.println("Introduce el nombre");
			nombre = entradaString.nextLine();
			
			while (flagMenu) {
			System.out.println("Introduce el valor de hambre ");
		
				try {
					hambre = entrada.nextInt();
					flagMenu = false;

				} catch (java.util.InputMismatchException e) {
					System.out.println();
					System.out.println("Introduzca un dato correcto:");
					entrada.nextLine(); // esto es para que no de error el escaner
				}
			}
			
			if (hambre > 100) {
				System.out.println("El valor máximo es 100, se usará ese valor");
				hambre = 100;
			} else if (hambre <= 0) {
				System.out.println("El valor mínimo para que el tamagochi no muera es 1, se usará ese valor");
				hambre = 1;
			}

			flagMenu=true;
			while (flagMenu) {
				System.out.println("Introduce el valor de sueño");
				try {
					sueno = entrada.nextInt();
					flagMenu = false;

				} catch (java.util.InputMismatchException e) {
					System.out.println();
					System.out.println("Introduzca un dato correcto:");
					entrada.nextLine(); // esto es para que no de error el escaner
					
				}
			}

			if (sueno > 100) {
				System.out.println("El valor máximo es 100, se usará ese valor");
				sueno = 100;
			} else if (sueno <= 0) {
				System.out.println("El valor mínimo para que el tamagochi no muera es 1, se usará ese valor");
				sueno = 1;
			}

			flagMenu=true;
			while (flagMenu) {
				System.out.println("Introduce el valor de higiene");
				try {
					higiene = entrada.nextInt();
					flagMenu = false;

				} catch (java.util.InputMismatchException e) {
					System.out.println();
					System.out.println("Introduzca un dato correcto:");
					entrada.nextLine(); // esto es para que no de error el escaner
					
				}
			}

			if (higiene > 100) {
				System.out.println("El valor máximo es 100, se usará ese valor");
				higiene = 100;
			} else if (higiene <= 0) {
				System.out.println("El valor mínimo para que el tamagochi no muera es 1, se usará ese valor");
				higiene = 1;
			}

			flagMenu=true;
			while (flagMenu) {
				System.out.println("Introduce el valor de diversion");
				try {
					diversion = entrada.nextInt();
					flagMenu = false;

				} catch (java.util.InputMismatchException e) {
					System.out.println();
					System.out.println("Introduzca un dato correcto:");
					entrada.nextLine(); // esto es para que no de error el escaner
					
				}
			}
			
			if (diversion > 100) {
				System.out.println("El valor máximo es 100, se usará ese valor");
				diversion = 100;
			} else if (diversion <= 0) {
				System.out.println("El valor mínimo para que el tamagochi no muera es 1, se usará ese valor");
				diversion = 1;
			}

			Tamagochi newTamagochi = new Tamagochi(nombre, hambre, sueno, higiene, diversion);

			coleccion[Tamagochi.contadorTamagochi] = newTamagochi;
			Tamagochi.contadorTamagochi++;

		}
	}
	

	public static void chequeo() {
		// lista todos los objetos del array y muestra los que tienen algun valor por
		// debajo de 20. Nombrandolo especificamente y dando sus datos. Se tiene en
		// cuenta los casos en los que no hay ningun tamagochi creado, o si alguno esta
		// muerto no aparece

		boolean emergencia = false;

		for (int i = 0; i < Tamagochi.contadorTamagochi; i++) {
			if (((coleccion[i].getDiversion() < 20) || coleccion[i].getHambre() < 20 || (coleccion[i].getHigiene() < 20)
					|| (coleccion[i].getSueno() < 20)) && (coleccion[i].isVivo() == true)) {
				System.out.println(coleccion[i].getNombre() + " está a punto de morir");
				System.out.println("Estos son sus datos actuales:");
				System.out.println(coleccion[i].toString());
				emergencia = true;
			}

		}

		if (emergencia == false) {
			System.out.println("No hay ningún tamagochi vivo en peligro");
		}

	}

	public static boolean previo(int aux) {
		// Comprobaciones previos antes de alimentar, acostar etc.. para ver si está
		// vivo.

		boolean previoOk = false;

		if (coleccion[aux].isVivo() == false) {

			System.out.println("Te recuerdo que " + coleccion[aux].getNombre() + " está muerto");

		} else {
			previoOk = true;

		}
		return previoOk;
	}

	// MENU

	public static int menu() {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		boolean flagMenu = true;

		while (flagMenu) {
			System.out.println();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++MENU++++++++++++++++++++++++");
			System.out.println("1- Crear Tamagochi");
			System.out.println("2- Listar Tamagochis de la colección");
			System.out.println("3- Alimentar");
			System.out.println("4- Acostar");
			System.out.println("5- Bañar");
			System.out.println("6- Jugar");
			System.out.println("7- Chequeo de emergencia");
			System.out.println("8- Salir");

			try {
				opcion = entrada.nextInt();
				flagMenu = false;
			} catch (java.util.InputMismatchException e) {
				System.out.println();
				System.out.println("Introduzca un dato correcto");
				entrada.nextLine(); // esto evita fallos del escaner
				System.out.println(); // esto evita fallos del escaner
			}
		}
		flagMenu = true;
		return opcion;

	}

	public static void tratarOpcion(int opcion) {
		boolean flagMenu = true;
		int aux = 99;

		switch (opcion) {

		case 1:
			crearTamagochi();

			break;

		case 2:

			listarTamagochi();

			break;

		case 3:
			// en cada accion tipo alimentar, acostar etc se llama al metodo para hacer las
			// comprobaciones previas, se listan todos los tamagochis, se pide que se elija
			// uno y se ejecuta el metodo segun lo elegido
			// el try catch controla solo la opcion de meter otra cosa que no sea un entero,
			// el resto de errores como meter
			// un numero negativo o elegir una opcion que no existe ya está contemplada en
			// la logica del programa..

			if (listarTamagochi()) {

				while (flagMenu) {
				System.out.println();
				System.out.println("Elige el número del Tamagochi que quieres alimentar");

					try {
						aux = entrada.nextInt();
						flagMenu=false;
					} catch (java.util.InputMismatchException e) {
						System.out.println("introduce un dato correcto");
						entrada.nextLine(); // esto es para que no de error el escaner
						System.out.println();
					}

				}
				
				if ((aux >= Tamagochi.contadorTamagochi) || (aux < 0)) {
					System.out.println("La opción elegida es incorrecta o ese tamagochi no existe");

				} else if (previo(aux)) {
					coleccion[aux].comer();
					System.out.println("Esta es su situación actual:");
					System.out.println(coleccion[aux].toString());

				}
				
				
			}
			flagMenu=true;
			break;

		case 4:

			if (listarTamagochi()) {
				
				while (flagMenu) {
					System.out.println();
					System.out.println("Elige el número del Tamagochi que quieres acostar");

						try {
							aux = entrada.nextInt();
							flagMenu=false;
						} catch (java.util.InputMismatchException e) {
							System.out.println("introduce un dato correcto");
							entrada.nextLine(); // esto es para que no de error el escaner
							System.out.println();
						}

					}

				if ((aux >= Tamagochi.contadorTamagochi) || (aux < 0)) {
					System.out.println("La opción elegida es incorrecta o ese tamagochi no existe");

				} else if (previo(aux)) {
					coleccion[aux].dormir();
					System.out.println("Esta es su situación actual:");
					System.out.println(coleccion[aux].toString());

				}
			}
			flagMenu=true;
			break;

		case 5:

			if (listarTamagochi()) {

				flagMenu=true;
				while (flagMenu) {
					System.out.println();
					System.out.println("Elige el número del Tamagochi que quieres bañar");

						try {
							aux = entrada.nextInt();
							flagMenu=false;
						} catch (java.util.InputMismatchException e) {
							System.out.println("introduce un dato correcto");
							entrada.nextLine(); // esto es para que no de error el escaner
							System.out.println();
						}

					}

				if ((aux >= Tamagochi.contadorTamagochi) || (aux < 0)) {
					System.out.println("La opción elegida es incorrecta o ese tamagochi no existe");

				} else if (previo(aux)) {
					coleccion[aux].higiene();
					System.out.println("Esta es su situación actual:");
					System.out.println(coleccion[aux].toString());

				}
			}
			flagMenu=true;
			break;

		case 6:
			if (listarTamagochi()) {

				
				while (flagMenu) {
					System.out.println();
					System.out.println("Elige el número del Tamagochi con el que quieres jugar");

						try {
							aux = entrada.nextInt();
							flagMenu=false;
						} catch (java.util.InputMismatchException e) {
							System.out.println("introduce un dato correcto");
							entrada.nextLine(); // esto es para que no de error el escaner
							System.out.println();
						}

					}

				if ((aux >= Tamagochi.contadorTamagochi) || (aux < 0)) {
					System.out.println("La opción elegida es incorrecta o ese tamagochi no existe");

				} else if (previo(aux)) {
					coleccion[aux].jugar();
					System.out.println("Esta es su situación actual:");
					System.out.println(coleccion[aux].toString());

				}
			}
			break;

		case 7:
			if (Tamagochi.contadorTamagochi == 0) {
				System.out.println("No hay ningún tamagochi creado");
			} else
				chequeo();

			break;

		case 8:
			System.out.println("Hasta luego");
			break;

		default:
			System.out.println("La opción seleccionada no existe, pruebe de nuevo");

		}

	}

}// fin class
