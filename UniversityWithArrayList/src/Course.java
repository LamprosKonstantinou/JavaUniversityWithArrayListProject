import java.util.ArrayList;

public class Course {
	private String name;
	private int ects;
	private Classroom room;
	private ArrayList<Student> students = new ArrayList<Student>();	
	public Course(String name, int eCTS) {
		this.name = name;
		ects = eCTS;
	}

	public void setClassroom(Classroom aRoom) {
		room = aRoom;
	}
	
	public void enroll (Student aStudent) {
		students.add(aStudent);
	}


	public void printCourseDetails() {
		System.out.println("Course name: " + name);
		System.out.println("ECTS: " + ects);
	    room.printLocation();
	    for(Student student: students) {
	    	student.printInfo();
	    }
	}
	
	public boolean isFull() {
		
		return (students.size() > room.getCapacity());
	}
}
