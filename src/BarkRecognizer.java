import java.util.ArrayList;

public class BarkRecognizer {

	public int recognized(String input, Dog dog) {
		
        if (input.equals(dog.getDog_sound())) { 
            return 1;
        } else {
            return 0;
        }
    }

}
