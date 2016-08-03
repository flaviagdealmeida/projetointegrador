import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int num = sc.nextInt();
		
			if (num > 0 && num <=1000)
				System.out.println("Está na faixa");
			else
				System.out.println("Não está na faixa");	

	}

}
