
public class Client {
	public static void main(String[] args) {
//		Display road = new RoadDisplay();
//		road.draw(); // 기본 도로만 표시
//
//		Display roadWithLane = new LaneDecorator(new RoadDisplay());
//		roadWithLane.draw(); // 기본도로 + 차선표시
//
//		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
//		roadWithTraffic.draw(); // 기본도로 + Traffic 표시
		
		// 기본 도로 표시
		Display d1 = new RoadDisplay();
		d1.draw();
		System.out.println("");
		
		// 기본 도로 표시 + 차선 표시
		Display d2 = new LaneDecorator(new RoadDisplay());
		d2.draw();
		System.out.println("");
		
		// 기본 도로표시 + 차션 표시 + 교통정보 표시
		Display d3 = new TrafficDecorator(d2);
		d3.draw();
		System.out.println();
		
		// 기본 도로표시 + 차선표시 + 교통정보표시 + 교차로 표시
		Display d4 = new CrossingDecorator(d3);
		d4.draw();
	}
}