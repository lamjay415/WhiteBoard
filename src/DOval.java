import java.awt.Graphics;
public class DOval extends DShape {
	
	public DOval() {
		dshapemodel=new DOvalModel();
	}
	public void draw(Graphics g) {
		g.drawOval(dshapemodel.getX(), dshapemodel.getY(), dshapemodel.getWidth(), dshapemodel.getHeight());
	}
}