package modules;

import java.util.Scanner;

public class Televisor {
	public static int volume= 0;// inicia em 0 e vai até 10  
	public static int canal = 1;// inicia em 1 e vai até 16
	public static boolean ligado = false; // inicia em desligado ou false

		static Scanner sc = new Scanner(System.in);
		
		public static void aumentarVolume() {        // Aumenta em 1 o volume
			
				do {
					System.out.println("Deseja aumentar o volume?");
					char op = sc.next().charAt(0);
					
					if(volume < 10 && op == 's'||volume < 10 && op =='S' ) {
						volume++;
						System.out.println("VOLUME: "+volume);
					}
					else if(volume == 10 && op =='s'||volume == 10 && op=='S'){
						System.out.println("VOLUME: "+volume);
						System.out.println("O volume está no MÁXIMO!\n");
					}
					else if(op != 's'||op != 'S') {
						MenuTv.Menus();
					}
					}while(volume <= 10);{
						
					}
			
				sc.close();
					
		}//fim método aumentarVolume
		
		public static void reduzirVolume(){	// Diminui em 1 o volume
			
				do {
					System.out.println("Deseja reduzir o volume?");
					char op = sc.next().charAt(0);
					
					if (volume == 0 && op =='s'|| volume == 0 && op =='S'){
						System.out.println("MUDO! VOLUME: "+volume);
						System.out.println("O volume está no MINIMO! \n");
					}					
					else if(volume > 0 && op == 's'||volume > 0 && op =='S') {
						volume--;
						System.out.println("VOLUME: "+volume);
					}
					else if(op != 's'||op == 'S') {
						MenuTv.Menus();
					}
					}while(volume >= 0);
			
			    sc.close();
			    
		}//fim método reduzirVolume
		
		public static void subirCanal() {        // Aumenta em 1 o canal
			
			do {
				System.out.println("Deseja aumentar o canal?"+canal);
				char op = sc.next().charAt(0);
				
				if(canal < 16 && op == 's'||canal < 16 && op =='S' ) {
					canal++;
					System.out.println("Canal: "+canal);
				}
				else if(canal == 16 && op =='s'||canal == 16 && op=='S'){
					System.out.println("Canal: "+canal);
					System.out.println("O canal está no LIMITE MÁXIMO!\n");
				}
				else if(op != 's'||op != 'S') {
					MenuTv.Menus();
				}
				}while(canal <= 16);{
					
				}
		
			sc.close();
				
	}//fim método subirCanal
		
		public static void descerCanal(){	// Diminui em 1 o canal
			
			do {
				System.out.println("Deseja reduzir o canal?"+canal);
				char op = sc.next().charAt(0);
				
				if (canal == 1 && op =='s'|| canal == 1 && op =='S'){
					System.out.println("Canal: "+canal);
					System.out.println("O canal está no LIMITE MÍNIMO! \n");
				}					
				else if(canal > 1 && op == 's'||canal > 1 && op =='S') {
					canal--;
					System.out.println("Canal: "+canal);
				}
				else if(op != 's'||op == 'S') {
					MenuTv.Menus();
				}
				}while(canal >= 1);
		
		    sc.close();
		    
	}//fim método descerCanal
		
		public boolean ligarTelevisor(boolean ligado) {
			System.out.println("Ligar TV?");
			int op = sc.next().charAt(0);
			 if (op == 's'||op == 'S') {
				 ligado = true;
				 System.out.println("TV está Ligada!");
				 System.out.println("Status: "+ligado);
				 MenuTv.Menus();
			 }else {
				 ligado = false;
				 System.out.println("Desligando!...");
				 System.out.println("Status: "+ligado);
				 System.exit(0);
			 }
			return ligado;
			
		}
		public boolean desligarTelevisor(boolean ligado) {
			System.out.println("Desligar TV?");
			int op = sc.next().charAt(0);
			 if (op == 's'||op == 'S') {
				 ligado = false;
				 System.out.println("Desligando...");
				 System.out.println("Status: "+ligado);
				 System.exit(0);
			 }else {
				 ligado = true;
				 System.out.println("TV está Ligada!");
				 System.out.println("Status: "+ligado);
				 MenuTv.Menus();
			 }
			return ligado;
		}
		public static void mostrarStatus() {
			
			System.out.println("Canal  | "+Televisor.canal);
			System.out.println("Volume | "+Televisor.volume);
			System.out.println("Status | "+Televisor.ligado);

		}
	
}//public class
