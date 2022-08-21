package flowcontrol;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TrafficLight {

	public static void main(String[] args) {
		new App();
	}

}

class App extends JFrame implements ItemListener {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JFrame actualWindow;
	JPanel messageContainer;
	JPanel lightsContainer;
	JLabel message;
	ButtonGroup btn_group;
	JRadioButton rb_red, rb_yellow, rb_green;

	App() {
		final Font myFont = new Font("Verdana", Font.BOLD, 30);
		actualWindow = new JFrame("Traffic Lights");
		messageContainer = new JPanel();
		lightsContainer = new JPanel();
		message = new JLabel("Select Light");
		btn_group = new ButtonGroup();
		rb_red = new JRadioButton("Red");
		rb_yellow = new JRadioButton("Yellow");
		rb_green = new JRadioButton("Green");

		actualWindow.setLayout(new GridLayout(2, 1));

		message.setFont(myFont);
		rb_red.setForeground(Color.RED);
		rb_yellow.setForeground(Color.YELLOW);
		rb_green.setForeground(Color.GREEN);

		btn_group.add(rb_red);
		btn_group.add(rb_yellow);
		btn_group.add(rb_green);

		rb_red.addItemListener(this);
		rb_yellow.addItemListener(this);
		rb_green.addItemListener(this);

		messageContainer.add(message);
		lightsContainer.add(rb_red);
		lightsContainer.add(rb_yellow);
		lightsContainer.add(rb_green);

		actualWindow.add(messageContainer);
		actualWindow.add(lightsContainer);

		actualWindow.setSize(300, 200);
		actualWindow.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		final JRadioButton selected = (JRadioButton) ie.getSource();
		final String textOnButton = selected.getText();
		if (textOnButton.equals("Red")) {
			message.setForeground(Color.RED);
			message.setText("STOP");
		} else if (textOnButton.equals("Yellow")) {
			message.setForeground(Color.YELLOW);
			message.setText("READY");
		} else {
			message.setForeground(Color.GREEN);
			message.setText("GO");
		}
	}
}