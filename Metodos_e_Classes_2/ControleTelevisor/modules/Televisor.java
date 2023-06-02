package modules;

import java.util.Scanner;
import principal.Program;

public class Televisor {
	public int volume;// inicia em 0 e vai até 10  
	public int canal = 1;// inicia em 1 e vai até 16
	public boolean ligado; // inicia em desligado ou false

		Scanner sc = new Scanner(System.in);
		
		public int aumentarVolume(int vol) {        // Aumenta em 1 o volume
			
				do {
					if (volume == 10){
						System.out.println("O volume está no máximo!\n");
					}
					else{
						volume+=1;
					}    
						System.out.println("Deseja aumentar o volume?");
						char op = sc.next().charAt(0);
					if(op == 's') {
					System.out.println("VOLUME: "+volume);
					
					}else {
						Program.Menus();
					}
					}while(volume <= 10);
			
			    sc.close();
				return volume;	
		}//fim método aumentarVolume
		
		public int reduzirVolume(int vol){	// Diminui em 1 o volume
			System.out.println(volume);
			//volume = tv.aumentarVolume(vol);
			//volume += tv.volume;
				do {
					if (volume == 0){
						System.out.println("O volume está no mínimo!\n");
					}
					else{
						volume--;
					}    
						System.out.println("Deseja reduzir o volume?");
						char op = sc.next().charAt(0);
					if(op == 's') {
					System.out.println("VOLUME: "+volume);
					
					}else {
						Program.Menus();
					}
					}while(volume <= 10);
			
			    sc.close();
				return volume;
		}//fim método reduzirVolume
	
}//public class
