
public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display decorateddisplay) {
		super(decorateddisplay);
	}
	
	public void draw() {
		super.draw();
		drawCrossing();
	}
	
	public void drawCrossing() {
		System.out.println("교차로 표시");
	}
	
}
