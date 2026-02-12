
public class DogBark {
	private String dogBark;

	public DogBark(String bark){
		this.dogBark=bark;
	}

	public String getDogBark() {return dogBark;}

	public boolean equals(String input){
		if(this.dogBark.equals(input)){
			return true;
		}
		return false;
	}
	
	
}
