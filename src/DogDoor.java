import java.lang.Thread;

public class DogDoor {
	
	int height;
	int width;
	int status;
	
	
	
	public DogDoor(int height, int width, int status) {
		super();
		this.height = height;
		this.width = width;
		this.status = status;
	}
	

	public void Change_Status() throws InterruptedException {
		if (status == 0) {
			this.status=1;
			System.out.println("Door opened");
			Thread.sleep(5000);
			this.status=0;
			System.out.println("Door Closed");
			
		}
		
		
	}

}
