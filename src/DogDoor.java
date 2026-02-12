

public class DogDoor {

	private boolean status;
	private int timeout;

	public DogDoor(boolean status, int timeout) {
		super();
		this.status = status;
		this.timeout=timeout;
	}
	

	public void open(){
		if(!status){
			status=true;
		}
	}

	public void close(){
		if(status){
			status=false;
		}
	}

	public int getTimeout() {
		return timeout;
	}

	public boolean getStatus(){
		return status;
	}
}
