package human;

public class teacher extends person { 
	
	private String teacherID; 
	private String takingCourse;  
	
//constructor of teacher
	public teacher(String Name, String Sex, int Age, String phone, String teacherID, String takingCourse) {
		
		super(Name, Sex, Age, phone);       //reference to super class(person)
		this.teacherID = teacherID;
		this.takingCourse = takingCourse;
	}
	
//get method of teacher
	
	public teacher() {
		// TODO Auto-generated constructor stub
	}

	public String getTeacherID() {
		
		return teacherID;
	}
	public String takingCourse() {
		
		return takingCourse;
	}
	
//set method of teacher
	
	public void setTeacherID(String teacherID) {
		
		this.teacherID = teacherID;
	}
	public void setTakingCourse(String takingCourse) {
		
		this.takingCourse = takingCourse;
	}

	@Override
	public void showDetails() {
		System.out.println("\n" + "Name: " + this.getName() 
		+ "\nSex: " + this.getSex() 
		+ "\nAge: " + this.getAge() 
		+ "\nTeacher ID: " + this.getTeacherID()
		+ "\nTeacher of: " + this.takingCourse);

	}
		
		
}














