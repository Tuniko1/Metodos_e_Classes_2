package principal;

import java.util.Scanner;

import modules.MenuTv;
import modules.Televisor;

public class Program {
						/*aumentarVolume()    // Aumenta em 1 o volume OK 	
						reduzirVolume()        // Diminui em 1 o volume 
						subirCanal()        // Aumenta em 1 o canal 
						descerCanal()        // Diminui em 1 o canal 
						ligarTelevisor()    // Liga a televisão 
						desligarTelevisor()    // Desliga a televisão 
						mostrarStatus()        // Dizer qual o canal, o volume e se o televisor está ligado
						 */
	Televisor tv = new Televisor();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao;
		 
		System.out.println("Ligar Televisão?");
		opcao = sc.next().charAt(0);
		if (opcao == 's'|| opcao =='S') {
			Televisor.ligado = true;
			System.out.println("Televisão Ligada!\n");
			System.out.println("Status: "+Televisor.ligado);
			
			do {
				
				System.out.println("Mostrar menu? Sim ou Não");
				opcao = sc.next().charAt(0);
					if (opcao == 's'||opcao == 'S') {
				MenuTv.Menus();
					}else {
					System.out.println("Fechando controles...");
					System.out.println("Status: "+Televisor.ligado);
					sc.close();
					}
			}while(opcao == 's');
	
		}else {
			System.out.println("Desligando...");
			System.out.println("Status: "+Televisor.ligado);
			System.exit(0);
		}
	
	
	}
}
