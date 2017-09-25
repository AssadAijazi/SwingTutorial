import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimplePanel extends JPanel {
	public SimplePanel() {
		JLabel label = new JLabel("A label");
		JTextField field = new JTextField(5);
		JButton button = new JButton("A button");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(field.getText());
			}
		});
		
		this.add(field);
		this.add(label);
		this.add(button);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Frame");
		frame.setSize(1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(new SimplePanel());
		frame.setVisible(true);

	}

}
