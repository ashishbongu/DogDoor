import java.util.ArrayList;
import java.util.Scanner;

public class DogDoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogDoor d = new DogDoor(100,100,0);
		Remote r=new Remote(true);
		BarkRecognizer b=new BarkRecognizer();
		
		ArrayList<Dog> doglist=new ArrayList<Dog>();
		Dog dog1=new Dog();
		doglist.add(dog1);
		dog1.setDog_sound("bow bow");
		Dog dog2=new Dog();
		doglist.add(dog2);
		dog2.setDog_sound("ruff ruff");
		String bark_input;
		
		System.out.println("Dog door");
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Present Door Status: "+ d.status);
			System.out.print("Bark input: ");
			bark_input=sc.nextLine();
			
			if (b.recognized(bark_input,dog2)==1) {
				System.out.println("BARK INPUT DETECTED!!");
				r.Change_Door_Status(d);
			}
			else {
				System.out.println("WRONG INPUT DETECTED!!");
			}
			
			System.out.println("\n");
		
		}
		
		
	}

}
