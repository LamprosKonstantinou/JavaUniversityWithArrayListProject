
public class Classroom {
	
	private String location;
	private int capacity;
	
	public Classroom(String aLocation, int aCapacity) {
		location = aLocation;
		capacity = aCapacity;
		
	}

	public int getCapacity() {
		// TODO Auto-generated method stub
		return capacity;
	}

	public void printLocation() {
		
		System.out.println("Location: " + location);
	}
}
