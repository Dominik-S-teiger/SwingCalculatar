import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui win = new Gui();
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);
		win.setSize(310, 110);
		// win.pack();
		win.setLocationRelativeTo(null);
		win.setResizable(false);
	}

}
