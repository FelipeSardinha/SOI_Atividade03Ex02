package view;
import javax.swing.JOptionPane;
import controller.Threads;
public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i ++) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opera��es: " + "\n" + "1. [Adi��o] \n" + "2. [Substra��o] \n" + "3. [Multiplaca��o] \n" + "4. [Divis�o]"));
			int a = Integer.parseInt(JOptionPane.showInputDialog("Primeiro n�mero: " ));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Segundo n�mero: " ));
		
		Threads calc = new Threads(opc, a, b);
		calc.run();
		}
	}
}