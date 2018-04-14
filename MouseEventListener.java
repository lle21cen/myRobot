import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventListener extends MouseAdapter {
	static Point startP;
	static Point endP;

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		startP = e.getPoint();
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

		endP = e.getPoint();

		if (RobotTester.RedButton.isSelected()) {
			ShapeComponent shape = new ShapeComponent(
					RobotTester.box.getSelectedIndex() + 1, 1, startP.x - 10,
					startP.y - 65, endP.y - startP.y, endP.x - startP.x);
			RobotTester.frm.add(shape);
			RobotTester.frm.revalidate();
			ShapeComponent.list.add(shape);
		} else if (RobotTester.GreenButton.isSelected()) {
			ShapeComponent shape = new ShapeComponent(
					RobotTester.box.getSelectedIndex() + 1, 2, startP.x - 10,
					startP.y - 65, endP.y - startP.y, endP.x - startP.x);
			RobotTester.frm.add(shape);
			RobotTester.frm.revalidate();
			ShapeComponent.list.add(shape);

		} else if (RobotTester.BlueButton.isSelected()) {
			ShapeComponent shape = new ShapeComponent(
					RobotTester.box.getSelectedIndex() + 1, 3, startP.x - 10,
					startP.y - 65, endP.y - startP.y, endP.x - startP.x);
			RobotTester.frm.add(shape);
			RobotTester.frm.revalidate();
			ShapeComponent.list.add(shape);
		}

	}

}
