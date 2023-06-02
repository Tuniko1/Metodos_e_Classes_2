package principal;

import java.awt.Menu;
import java.util.Scanner;

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
		 
			do {
				
				System.out.println("Mostrar menu? Sim ou Não");
				opcao = sc.next().charAt(0);
					if (opcao == 's'||opcao == 'S') {
				Menus();
					}else {
					System.exit(0);
					sc.close();
					}
			}while(opcao == 's');
	}
	
	// Menu de controles
	public static void Menus() {
		
		Scanner sc = new Scanner(System.in);
		
		
			int opcao;		
			System.out.println("Entre com a opção desejada:");
			System.out.println("1 - Aumentar Volume");
			System.out.println("2 - Diminuir Volume ");
			System.out.println("3 - Programa");
			opcao = sc.nextInt();
			Televisor tv = new Televisor();
			switch (opcao){
			
			case 1:
				tv.aumentarVolume(0);
				
				break;
			case 2:
				tv.reduzirVolume(0);
			
				break;
			case 3:
								
				break;
			default: System.out.println("Opção inválida!");
			
			sc.close();
		}
	}
}
