package modules;

import java.util.Scanner;

public class MenuTv {
	
	// Menu de controles
		public static void Menus() {
			
			Televisor tv = new Televisor();
			Scanner sc = new Scanner(System.in);
			
				int opcao;		
				System.out.println("Entre com a opção desejada:");
				System.out.println("1 - Aumentar Volume");
				System.out.println("2 - Diminuir Volume ");
				System.out.println("3 - Subir Canal");
				System.out.println("4 - Descer Canal");
				System.out.println("5 - Ligar TV");
				System.out.println("6 - Desligar TV");
				System.out.println("7 - Mostrar Status");
				opcao = sc.nextInt();
				
				switch (opcao){
				
				case 1:
					Televisor.aumentarVolume();
					
					break;
				case 2:
					Televisor.reduzirVolume();
				
					break;
				case 3:
					Televisor.subirCanal();			
					break;
				case 4:
					Televisor.descerCanal();
					break;
				case 5:
					tv.ligarTelevisor(false);
					break;
				case 6:
					tv.desligarTelevisor(false);
					break;
				case 7:
					Televisor.mostrarStatus();
					break;
				default: System.out.println("Opção inválida!");
				
				sc.close();
			}
		}
}
