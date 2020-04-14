package human;

public class course {
	private String courseName;
	private String courseCode;

//constructor of course
	public course(String courseName, String courseCode)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

//get method of person
	public String getCourseName(){
		return courseName;
	}
	public String getCourseCode(){
		return courseCode;
	}
	
	
//set method of person
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}

	public void setCourseCode(String courseCode){
		this.courseCode = courseCode;
	}
}
