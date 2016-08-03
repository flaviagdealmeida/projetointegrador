import javax.swing.JOptionPane;

public class Numero3 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog
				("Informe um numero"));
		
			if (num % 3 == 0 && num % 4 == 0 )
				JOptionPane.showMessageDialog(null, "Divisivel por 3 e 4");
			else if (num % 3 == 0)
				JOptionPane.showMessageDialog(null, "Divisivel por 3");
			else if (num % 4 == 0)
				JOptionPane.showMessageDialog(null, "Divisivel por 4");
			else 
				JOptionPane.showMessageDialog(null, "Não é divisivel por nenhum dos 2!");
	}

}
