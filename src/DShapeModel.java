import java.awt.Color;
import java.util.Arrays;

public class DShapeModel implements Comparable  {
	Color color;
	int x,y,width,height;

	public DShapeModel() {
		color=Color.GRAY;
		
		x=0;
		y= 0;
		width=0;
		height=0;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}
	public void setX(int a) {
		x=a;
	}
	public void setY(int a) {
		y=a;
	}
	public void setWidth(int a) {
		width=a;
	}
	public void setHeight(int a) {
		height=a;
	}
	public int[] getBounds() {
		int[] bounds = new int[4];
		bounds[0]= x; //low x
		bounds[1]=x+width; // high x
		bounds[2]=y; //low y
		bounds[3]=y+height;//high y
		return bounds;
		
	}
	public void moveBy(int dx, int dy) { 
		 x += dx;
		 y += dy;
		 
	}


	
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
	if(Arrays.equals(((DShapeModel)other).getBounds(), this.getBounds())) {
		return 0;
	}
		return 1;
	}

	
}