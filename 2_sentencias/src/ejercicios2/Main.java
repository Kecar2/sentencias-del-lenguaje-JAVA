package ejercicios2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8();
		p9();
		//p10i();
		//p11();
		//p12();
		//p13();
		//p14();
	}
	
/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p1() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introducir numero: ");
		int x = reader.nextInt();
		if (x > 10)
			System.out.println("Numero demasiado alto!");
		else
			System.out.println("Numero demasiado bajo!");
	}
	
/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p2() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce dia de la semana: ");
		String dia = reader.next().toLowerCase();
		if ( dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")  )
			System.out.println("A estudiar toca!");
		else if ( dia.equals("sabado") || dia.equals("domingo"))
			System.out.println("Por fin descanso!!!");
	}
	
/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p3() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce cantidad de dinero: ");
		int dinero = reader.nextInt();
		if (dinero >= 10)
			System.out.println("Vamos al video club!!!");
		else if(dinero >= 5)
			System.out.println("Vamos al cine!!!");
		else
			System.out.println("Vamos al parque :(");	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p4() {
		Scanner reader = new Scanner(System.in);
		int i = 0, numero;
		int suma = 0;
		do {
			System.out.println("Introduce cantidad " + i +": ");
			numero = reader.nextInt();
			suma = suma + numero;
			if (suma > 100) {
				System.out.println("Te has pasado! Fin");
				break;
		}else 
			System.out.println("Resultado de la suma "+ suma);
		i++;
	}while (suma < 100 && i < 5);
		if (i==5) System.out.println("Secuencia correcta");
		else System.out.println("Secuencia incorrecta");
	}

	/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p5() {
		Scanner reader = new Scanner(System.in);
		int i = 0, numero;
		int suma = 0;
		do {
			System.out.println("Introduce cantidad " + i +": ");
			numero = reader.nextInt();
			suma = suma + numero;
			if (suma > 100) {
				System.out.println("Te has pasado! Fin");
				break;
		}else 
			System.out.println("Resultado de la suma "+ suma);
		i++;
	}while (suma < 100 && i < 5);
		if (i==5) System.out.println("Secuencia correcta");
		else System.out.println("Secuencia incorrecta");
		if(suma%2==0) System.out.println(suma +"Es multiplo de 2");
		if(suma%3==0) System.out.println(suma +"Es multiplo de 3");
		if(suma%5==0) System.out.println(suma +"Es multiplo de 5");
	}
	
/////////////////////////////////////////////////////////////////////////////////////

	public static void p6() {
		Scanner reader = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduce una opcion [1-5]: ");
		numero = reader.nextInt();
		switch(numero) {
		case 1:
			System.out.println("Has elegido la opcion 1");
			break;
		case 2:
			System.out.println("Has elegido la opcion 2");
			break;
		case 3:
			System.out.println("Has elegido la opcion 3");
			break;
		case 4:
			System.out.println("Has elegido la opcion 4");
			break;
		case 5:
			System.out.println("Has elegido la opcion 5");
			break;
		default:
			System.out.println("No has elegido una opcion!!");
		}
	}

/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p8() {
		for (int i=1; i<100; i++) {
			System.out.println(i+" ");
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////
	
	public static void p9() {
		int numero = 37;
		for (int i=0; i<=10; i++) {
			System.out.println(numero+" * "+i+" = "+ (numero*i));
		}
		}
	
}
	


