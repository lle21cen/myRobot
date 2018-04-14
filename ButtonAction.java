import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;

public class ButtonAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Timer time=new Timer();
		TimeTask task=new TimeTask();
		time.scheduleAtFixedRate(task, new Date(), 100);
	}
}
