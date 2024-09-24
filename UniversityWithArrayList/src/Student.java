import java.util.ArrayList;

public class Student {
	private String name;
	private String id;
	private ArrayList<Course> courses;
	
	public void printInfo() {
		
		System.out.println("Name :"+ name );
		System.out.println("Id: " + id);
		
	
		System.out.println("-----------");
	}
	
	public void addCourse(Course aCourse) {
		  
		if(!aCourse.isFull()) {
			courses.add(aCourse);
			aCourse.enroll(this);
			System.out.println("Student successfully enrolled in a course");
		}
		else {
			System.out.println("The course is full");
		}
		
		
		
	    
	   
	}
	
	public Student(String aName, String someId) {
		name = aName;
		id = someId;
		courses = new ArrayList<Course>();
	}

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
}
