import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numero5 {

	public static void main(String[] args) {

	BufferedReader bf = new BufferedReader
			(new InputStreamReader(System.in));
	
	try {
		
		System.out.println("Informe numero");
		int num = Integer.parseInt(bf.readLine());
		// reposta 1
		System.out.println("Cubo:"+ num*num*num );
		///////////////////////////////////////
		
		// resposta 2
		int cubo = 1;
		
		for (int i = 0; i <3; i++)
			cubo *=num;
		System.out.println(cubo);
		////////////////////////////////
	}catch (IOException e){
		e.printStackTrace();
	}
		
		
		
		

	}

}
