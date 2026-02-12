import java.util.ArrayList;
import java.util.Scanner;

public class DogDoorTest {

	public static void main(String[] args) throws InterruptedException {
		DogDoor door = new DogDoor(false,2000);
		Remote remote=new Remote(door,true);
		BarkRecognizer b=new BarkRecognizer(door);
		
		DogBark bark1=new DogBark("bow bow");
		DogBark bark2=new DogBark("ruff ruff");
		b.addDogBark(bark1);
		b.addDogBark(bark2);

		String bark_input;
		
		System.out.println("\n\nDog Door Software: ");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Bark input: ");
		bark_input=sc.nextLine();
		b.recognize(bark_input);
		System.out.println("\n");

		int input;
		while (true) {
			System.out.print("Remote Control (1/0): ");
			input=sc.nextInt();
			if(input==1){
				remote.pressButton(door);
				System.out.println("Door opened!");
			}else if(input==0){
				remote.pressButton(door);
				System.out.println("Door Closed!");
			}
		}
		
		
		
	}

}
