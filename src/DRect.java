
import java.awt.Graphics;

public class DRect extends DShape {

	public DRect() {
		dshapemodel=new DRectModel();
	}
	 
	public void draw(Graphics g) {
	
		g.drawRect(dshapemodel.getX(), dshapemodel.getY(), dshapemodel.getWidth(), dshapemodel.getHeight());	
		
	}
	
}