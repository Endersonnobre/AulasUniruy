import java.util.ArrayList;

public class Atividade3 {

	public void Resolucao1() {

		int[] a1 = {1 , 15, 16};
		int[] a2 = {7, 8, 9, 15, 16};
		int[] aSoma = new int[a1.length > a2.length ? a1.length : a2.length];
		
		if(a1.length > a2.length) {
			
			for(int i = 0; i < a1.length; i++) {
				if(i < a2.length) {
					aSoma[i] = a1[i] + a2[i];
				}
				else {
					aSoma[i] = a1[i] + 0;
				}	
			}

		}
		else {
			for(int i = 0; i < a2.length; i++) {
				if(i < a1.length) {
					aSoma[i] = a2[i] + a1[i];
				}
				else {
					aSoma[i] = a2[i] + 0;
				}	
			}
		}
		
		for(int i = 0; i < aSoma.length; i++) {
			System.out.println(aSoma[i]);
		}
	}
	
	public void Resolucao2() {
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Vermelho");
		cores.add("Verde");
		cores.add("Azul");
		cores.add("Amarelo");
		cores.add("Cinza");
		cores.add("Preto");
		
		System.out.println("Antes");
		for(String s : cores) {
			System.out.println(s);
		}
		
		cores.remove("Cinza");
		
		System.out.println("");
		System.out.println("Depois");
		
		for(String s : cores) {
			System.out.println(s);
		}
		
	}
	
	
	
}

