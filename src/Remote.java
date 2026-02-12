import java.util.Scanner;

public class Remote {
	boolean battery_status;
	
	public Remote(boolean battery_status) {
		super();
		this.battery_status = battery_status;
	}
	
	public void Change_Door_Status(DogDoor d) {
		try {
			d.Change_Status();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
