import java.util.ArrayList;

public class Registry {

	private String departmentName;
	private ArrayList<Course> allCourses = new ArrayList<Course>();

	public Registry(String departmentname) {
		super();
		this.departmentName = departmentname;
	}
	
	public void addCourse(Course aCourse) {
		allCourses.add(aCourse);
	}
	
	public void printAllRecords() {
		
		System.out.println("Department name: " + departmentName);
		System.out.println("The department courses are: ");
		for(Course course: allCourses) {
			 course.printCourseDetails();
		 }
	}
	
	
}
