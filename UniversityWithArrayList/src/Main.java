
public class Main {
	public static void main(String[] args) {
		
		Registry doaiRegistry = new Registry("Applied Informatics");
		
		Student s1 = new Student("Sakis", "dai18057");
		Student s2 = new Student("Takis", "dai19957");
		Student s3 = new Student("Mpamis", "ics21065");

		
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Machine Learning", 5);
		
		Classroom room1 = new Classroom("Erg234", 2);

		Classroom room2 = new Classroom("Amf13", 2);
		
		c1.setClassroom(room1);
		c2.setClassroom(room2);
		
		doaiRegistry.addCourse(c1);
		doaiRegistry.addCourse(c2);
        
		s1.addCourse(c1);
	    s2.addCourse(c1);
	    s2.addCourse(c2);
	    s3.addCourse(c2);
		
		doaiRegistry.printAllRecords();
		
}
}
