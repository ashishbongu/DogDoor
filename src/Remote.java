import java.util.Scanner;

public class Remote {
	boolean battery_status;
	DogDoor door;
	
	public Remote(DogDoor door, boolean battery_status) {
		super();
		this.door=door;
		this.battery_status = battery_status;
	}
	
	public void pressButton(DogDoor d) {
		if(door.getStatus()){
			door.close();
		}else{
			door.open();
		}

	}

	

}
