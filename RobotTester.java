import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RobotTester {

	static JFrame frm;
	static JComboBox<String> box;
	static JButton button;
	static JRadioButton RedButton;
	static JRadioButton GreenButton;
	static JRadioButton BlueButton;

	public static void main(String[] args) {
		frm = new JFrame("Robot");
		frm.setBounds(500, 200, 400, 500);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		RedButton = new JRadioButton("Red");
		GreenButton = new JRadioButton("Green");
		BlueButton = new JRadioButton("Blue");

		button = new JButton("Move my Robot");
		ButtonGroup group = new ButtonGroup();
		group.add(RedButton);
		group.add(GreenButton);
		group.add(BlueButton);

		panel.add(RedButton);
		panel.add(GreenButton);
		panel.add(BlueButton);

		ShapeComponent shape = new ShapeComponent(1, 2, 100, 100, 50, 50);

		MouseEventListener mouse = new MouseEventListener();
		Vector<String> list = new Vector<String>();
		list.add("Rectangle");
		list.add("Circle");
		list.add("Triangle");

		box = new JComboBox<String>(list);
		box.setBounds(0, 40, 380, 30);

		ButtonAction actionListen = new ButtonAction();
		button.addActionListener(actionListen);

		frm.add(panel, BorderLayout.NORTH);
		frm.add(box);
		frm.add(shape);
		frm.remove(shape);
		frm.add(button, BorderLayout.SOUTH);
		frm.addMouseListener(mouse);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
