import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {
		
		String meses[]={"Janeiro","Fevereiro","Mar�o",
				"Abril","Maio","Junho","Julho",
				"Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Informe o mes desejado: ");
			int mes = sc.nextInt();
			
			System.out.println("O mes � "+meses[mes-1]);
		
		

	}

}
