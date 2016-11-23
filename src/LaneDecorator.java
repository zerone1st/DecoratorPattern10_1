/*
 *  차선 표시 기능 추가 클래스
 */
public class LaneDecorator extends DisplayDecorator {
	
	//기존 표시 클래스의 설정
	public LaneDecorator(Display decorateddisplay) {
		super(decorateddisplay);
	}

	public void draw() {
		super.draw();
		drawLane();
	}
	
	private void drawLane() {
		System.out.println("차선 표시");
	}
}
