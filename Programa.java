import java.util.Scanner;
import java.util.Random;
public class Programa {
	
	void iniciar(){
		
	Scanner entrada = new Scanner(System.in);
	Random azar = new Random();
	int usuario;
	int numero = azar.nextInt(99)+1;
	
		System.out.println("ingrese un numero del 1 al 100");
			usuario = entrada.nextInt();	
			do {
					if (usuario < numero) {
						System.out.println("Demacido Chico \n Ingrese otro");
						usuario = entrada.nextInt();
					}
					else if (usuario > numero) {
						System.out.println("Demaciado Grande \n Ingrese otro");
						usuario = entrada.nextInt();
					}
				} while (numero != usuario);
	System.out.println("Felicitaciones, acertó el número " + numero);
	
}


}