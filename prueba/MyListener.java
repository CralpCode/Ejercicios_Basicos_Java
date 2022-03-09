import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener  implements KeyListener {
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Type Event ");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key Press Event ");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Release Event ");
	}

	public static void main(String[] args) {
		JFrame jf = new JFrame("MyListener");
		jf.addKeyListener(new MyListener());
		jf.setBounds(300,300,100,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}