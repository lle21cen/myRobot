import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Vector;

import javax.swing.JComponent;

public class ShapeComponent extends JComponent implements MyRobot {

	private int type;
	private int color;

	private int[] x2 = new int[3];
	private int[] y2 = new int[3];

	private int startX;
	private int startY;
	private int height;
	private int width;

	static Vector<ShapeComponent> list = new Vector<ShapeComponent>();

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public ShapeComponent(int type, int color, int startX, int startY,
			int height, int width) {
		this.type = type;
		this.color = color;
		this.startX = startX;
		this.startY = startY;
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw(Graphics2D g2) {
		// TODO Auto-generated method stub
		int endX = startX + width;
		int endY = startY + height;

		x2[0] = startX;
		x2[1] = (endX + startX) / 2;
		x2[2] = endX;

		y2[0] = endY;
		y2[1] = startY;
		y2[2] = endY;

		if (color == 1) {
			g2.setColor(Color.red);
			if (type == 1) {
				g2.fillRect(startX, startY, width, height);
			}
			if (type == 2) {
				g2.fillOval(startX, startY, width, height);
			}
			if (type == 3) {
				g2.fillPolygon(x2, y2, x2.length);
			}
		} else if (color == 2) {
			g2.setColor(Color.green);
			if (type == 1) {
				g2.fillRect(startX, startY, width, height);
			}
			if (type == 2) {
				g2.fillOval(startX, startY, width, height);
			}
			if (type == 3) {
				g2.fillPolygon(x2, y2, x2.length);
			}
		} else if (color == 3) {
			g2.setColor(Color.blue);
			if (type == 1) {
				g2.fillRect(startX, startY, width, height);
			}
			if (type == 2) {
				g2.fillOval(startX, startY, width, height);
			}
			if (type == 3) {
				g2.fillPolygon(x2, y2, x2.length);
			}
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		Graphics2D g2 = (Graphics2D) g;

		draw(g2);
	}

	public void move() {
		RobotTester.frm.remove(this);
		this.startX += 1;
		RobotTester.frm.add(this);
		RobotTester.frm.repaint();

	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getStartX() {
		return startX;
	}

	public int getStartY() {
		return startY;
	}
}
