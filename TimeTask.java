import java.util.TimerTask;

public class TimeTask extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ShapeComponent.list.size(); i++) {
			ShapeComponent.list.get(i).move();
		}
	}
}
