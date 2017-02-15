import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {
	private JTextField testo;
	private JTextArea chat;
	private JButton invia;
	private Robot robot;

	public Frame(Robot r) {
		super("Robot");
		Container c = this.getContentPane();
		robot = new Robot();
		robot = r;
		chat = new JTextArea("Interroga il tuo robot:\n\n");
		chat.setEditable(false);
		JScrollPane ja = new JScrollPane(chat);
		c.add(ja);
		testo = new JTextField(36);
		JPanel ps = new JPanel();
		ps.add(testo);
		JButton invia = new JButton("Invia");
		invia.addActionListener(this);
		ps.add(invia);
		c.add(ps, "South");
		JPanel pe = new JPanel();
		JPanel pn = new JPanel();
		JPanel po = new JPanel();
		c.add(pe, "East");
		c.add(pn, "North");
		c.add(po, "West");
		setResizable(false);
		setLocation(100, 100);
		setSize(500, 500);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		chat.append("Utente: "+testo.getText() + "\n");
		chat.append("Robot: "+robot.getDomRisp() + "\n");
		robot.addDomRisp(testo.getText());
		testo.setText("");
		;
	}

	public static void main(String args[]) {
		Robot r = new Robot();
		new Frame(r);

	}
}
