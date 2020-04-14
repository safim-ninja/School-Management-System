package school;

import human.person;
import human.student;
import human.teacher;

public class school {

	public static void main(String[] args) {
		
		person student_1 = new student("safim", "Male", 22, "016240*****", 1044, 7);
		person Teacher_1 = new teacher("Jahangir Alam", "Male", 46, "017658******", "tch-19002", "Maths");
		
		
		student_1.showDetails();
		Teacher_1.showDetails();
		
	}
}
