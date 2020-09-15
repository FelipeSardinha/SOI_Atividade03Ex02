package view;
import javax.swing.JOptionPane;
import controller.Threads;
public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i ++) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das operações: " + "\n" + "1. [Adição] \n" + "2. [Substração] \n" + "3. [Multiplacação] \n" + "4. [Divisão]"));
			int a = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número: " ));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Segundo número: " ));
		
		Threads calc = new Threads(opc, a, b);
		calc.run();
		}
	}
}