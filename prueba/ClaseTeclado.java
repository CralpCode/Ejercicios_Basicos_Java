import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClaseTeclado extends JFrame{

	static KeyEvent e;
    public ClaseTeclado(){
        boolean error = false;
        

            KeyListener escucharTeclado = new KeyListener(){
                @Override
                public void keyTyped(KeyEvent e) {
                    System.out.println("keyTyped");
                }
    
                @Override
                public void keyPressed(KeyEvent e) {
                    System.out.println("keyPressed");
                }
    
                @Override
                public void keyReleased(KeyEvent e) {
                    System.out.println("keyReleased");
                }
            };
    
            addKeyListener(escucharTeclado);
            setFocusable(true);
          
        }

    public static void main(String[] args) {
        ClaseTeclado tecla = new ClaseTeclado();
		while (true) {
			try {
				Thread.sleep(10);
				System.out.println(" ");
				System.out.println(" "+tecla);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
