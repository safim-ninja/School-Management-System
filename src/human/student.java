package human;

import inact.Subject;

public class student extends person {
	
	private int roll;
	private int Class;
	private Subject s = new Subject();
	
// default constructor of student
	public student() {
		
	}
//constructor of student
	public student(String Name, String Sex, int Age, String phone, int roll, int Class) {
		
		super(Name, Sex, Age, phone);       //reference to super class(person)
		this.roll = roll;
		this.Class = Class;
	}
	

//get method of student
	
	public int getRoll() {
		
		return roll;
	}
	public int getclass() {
		
		return Class;
	}

//set method of teacher
	
	public void setRoll(int roll) {
		
		this.roll = roll;
	}
	public void setClass(int Class) {
		
		this.Class = Class;
	}
		
	public void academicReport()
	{
		
	}
	
	public void paymentReport()
	{
		
	}
	
	public void getSubjects()
	{
		s.printSub(this.Class);
	}


	@Override
	public void showDetails() {
		System.out.printf("\n" + "Name: " + this.getName() 
		+ "\nSex: " + this.getSex() 
		+ "\nAge: " + this.getAge() 
		+ "\nStudent Roll: " + this.getRoll() 
		+ "\nStudent Class: " + this.getclass() 
		+ "\nSubjects:\n" );
		this.getSubjects();

	}
}










