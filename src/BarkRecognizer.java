import java.util.ArrayList;
import java.lang.Thread;

public class BarkRecognizer {

    ArrayList<DogBark> allowedBarks=new ArrayList<>();
    DogDoor door;

    public BarkRecognizer(DogDoor door){
       this.door=door;
    }

    public void addDogBark(DogBark bark){
        allowedBarks.add(bark);
    }

	public void recognize(String input) throws InterruptedException {
		for(DogBark barks:allowedBarks){
            if(barks.equals(input)){
                door.open();
                System.out.println("Door Status: "+door.getStatus());
                System.out.println("waiting.....");
                Thread.sleep(door.getTimeout());
                door.close();
                System.out.println("Door Status: "+door.getStatus());
                return;
            }
        }
        
        System.out.println("INPUT NOT FOUND !");
    }

}
