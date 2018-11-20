import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	 int mole = 0;
 JFrame frame;
 JPanel panel;
 JButton b1;
 JButton b2;
 JButton b3;
 JButton b4;
 JButton b5;
 JButton b6;
 JButton b7;
 JButton b8;
 JButton b9;
 JButton b10;
 JButton b11;
 JButton b12;
int c = 0;
int w = 0;
static Date d;
	public static void main(String[] args) {
		WhackAMole wack = new WhackAMole();
		 wack.DrawButtons();
		 d = new Date();
	}
	
	public void DrawButtons() {
		frame = new JFrame();
		panel = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		b12 = new JButton();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this); 
		b4.addActionListener(this); 
		b5.addActionListener(this); 
		b6.addActionListener(this); 
		b7.addActionListener(this); 
		b8.addActionListener(this); 
		b9.addActionListener(this); 
		b10.addActionListener(this); 
		b11.addActionListener(this); 
		b12.addActionListener(this); 
		
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		frame.setTitle("Whack-a-Mole");
		frame.setVisible(true);
		frame.setSize(300, 200);
		Random rand = new Random();
		int r = rand.nextInt(11);
		if(r == 0) {
			b1.setText("mole!");
			mole = 1;
		}
		if(r == 1) {
			b2.setText("mole!");
			mole = 2;
		}
		if(r == 2) {
			b3.setText("mole!");
			mole = 3;
		}
		if(r == 3) {
			b4.setText("mole!");
			mole = 4;
		}
		if(r == 4) {
			b5.setText("mole!");
			mole = 5;
		}
		if(r == 5) {
			b6.setText("mole!");
			mole = 6;
		}
		if(r == 6) {
			b7.setText("mole!");
			mole = 7;
		}
		if(r == 7) {
			b8.setText("mole!");
			mole = 8;
		}
		if(r == 8) {
			b9.setText("mole!");
			mole = 9;
		}
		if(r == 9) {
			b10.setText("mole!");
			mole = 10;
		}
		if(r == 10) {
			b11.setText("mole!");
			mole = 11;
		}
		if(r == 11) {
			b12.setText("mole!");
			mole = 12;
		}
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		System.out.println("1");
		
		if(buttonPressed.getText().equals("mole!")) {
			System.out.println("2");
				frame.dispose();
				DrawButtons();
				
				c += 1;
			}
			else {
				speak("wrong");
				w += 1;
				frame.dispose();
				DrawButtons();
			}
		if(c == 10) {
			endGame(d,c);
		}
			}
		
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
}
