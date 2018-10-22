import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JButton b1 = new JButton();
	JButton b2 = new JButton();
	public static void main(String[] args) {
	
	}
	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		b1.setText("joke");
		b2.setText("punchline");
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(b1);
		frame.add(b2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		if(e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "hi");
		}
		
	}
	
}
