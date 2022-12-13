import java.awt.Graphics;

public class Polygon extends Shape {
	
	private Point[] pts;
	private int[] xValues;
	private int[] yValues;
	int number = 3;
	
	public Polygon(int x, int y, int h, int n) {
		this.number = n;
		
		Point center = new Point(x,y);
		Point start = new Point(x, y-h);
		
		pts = new Point[n];
		xValues = new int[n];
		yValues = new int[n];
		
		pts[0] = start;
		xValues[0] = pts[0].getX();
		yValues[0] = pts[0].getY();
		
		for(int i = 1; i<n; ++i) {
			Point pt = start.rotateAround(center, i*360/n);
			pts[i]=pt;
			xValues[i] = pts[i].getX();
			yValues[i] = pts[i].getY();
			
		}
	}
	
	@Override
	public void drawTo(Graphics g) {
		g.setColor(color);
		g.drawPolygon(xValues, yValues, number);
		
	}

}
