import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
 static JFrame frame = new JFrame();
 static char currentLetter;
 static JLabel label = new JLabel();
 static TypingTutor tutor = new TypingTutor();

public static void main(String[] args) {
	frame.setTitle("Type or Die");
    frame.add(label);
    currentLetter = generateRandomLetter();
    label.setText("" + currentLetter);
    label.setFont(label.getFont().deriveFont(28.0f));
    label.setHorizontalAlignment(JLabel.CENTER);
    frame.setSize(250, 100);
    frame.setVisible(true);
    tutor.Setup();
    
  
}
	public void Setup() {
		frame.addKeyListener(this);
        
	}
	static char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar());
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		
		
		
	}
	
	
	
	
}
