import java.awt.Graphics;

public class Oval extends Shape{

	int radius = 1;
	int height = 1;
	
	public Oval(int x, int y, int radius, int height) {
		this.setPosition(x, y);
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public void drawTo(Graphics g) {
		g.setColor(color);
		g.drawOval(getX(), getY(), 2*radius, height);
		
	}
	
}