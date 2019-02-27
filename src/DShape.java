import java.awt.Graphics;
import java.awt.Point;

public class DShape {
	DShapeModel dshapemodel;
	public void draw(Graphics g) {
		
	}
	public Point[] getKnobs() {
		Point[] knobArray=new Point[4];
		int a = dshapemodel.getX()+dshapemodel.getWidth();
		int b = dshapemodel.getY()+dshapemodel.getHeight();
		knobArray[0]=new Point(dshapemodel.getX(),dshapemodel.getY()); // top left corner
		knobArray[1]=new Point(a-5,dshapemodel.getY());
		knobArray[2]=new Point(dshapemodel.getX(),b-5);
		knobArray[3]=new Point(a-5,b-5);
		return knobArray;
	}
	public int[] getBounds() {
		return dshapemodel.getBounds();
		
	}
	public void drawKnobs(Graphics g) {
		
		for(int i = 0 ; i < getKnobs().length;i++) {
			Point p = getKnobs()[i];
			
			g.fillRect((int)p.getX(),(int)p.getY(), 5, 5);
		
		}
	}
	
}