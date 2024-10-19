import java.awt.*;
import java.applet.*;

class simpleapplet extends Applet { 
	public void paint(Graphics g) {
		g.drawString("A simple Applet " , 20 , 20);
	}

	public static void main(String[] args) {
		paint();
	}
}