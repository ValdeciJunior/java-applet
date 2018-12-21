package principal;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Avaliacao extends JApplet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void paint(Graphics g) {
		String notas = JOptionPane.showInputDialog("Infomr o numero");
		Float nota = Float.parseFloat(notas);
		
		
		if(nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Essa nota é inválida");
			paint(null);
		}else {
			if(nota< 50) {
				JOptionPane.showMessageDialog(null, "Insuficiente");
			}else if(nota < 70) {
				JOptionPane.showMessageDialog(null, "Regular");
			}else if(nota < 90){
				JOptionPane.showMessageDialog(null, "Bom");
			}else {
				JOptionPane.showMessageDialog(null, "Excelente");
			}
			System.exit(0);
		}
	}
}
