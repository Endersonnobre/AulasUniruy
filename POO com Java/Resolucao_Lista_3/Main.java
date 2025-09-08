import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		//Atividade3 res = new Atividade3();
		//ContaCorrente cc = new ContaCorrente();
		//ClienteEspecial ce = new ClienteEspecial();
		//res.Resolucao1();
		//res.Resolucao2();
		/*cc.depositar(1000);
		cc.saque(100);
		System.out.println("Conta Corrente: "+ cc.getSaldo());
		
		ce.depositar(1000);
		ce.saque(100);
		System.out.println("Conta Corrente: "+ ce.getSaldo());*/
		
		Forma f = new Quadrado(10);
		Forma f2 = new Retangulo(3, 6);
		Forma f3 = new Circulo(15);
		
		System.out.println("Quadrado:");
		System.out.println("Aréa: " + f.calcAr());
		System.out.println("Perímetro: " + f.calcPer());
		System.out.println(" ");
		
		System.out.println("Retangulo:");
		System.out.println("Aréa: " + f2.calcAr());
		System.out.println("Perímetro: " + f2.calcPer());
		System.out.println(" ");
		
		System.out.println("Circulo:");
		System.out.println("Aréa: " + f3.calcAr());
		System.out.println("Perímetro: " + f3.calcPer());
		System.out.println(" ");
		
		
		
		
 
	}
	

}




