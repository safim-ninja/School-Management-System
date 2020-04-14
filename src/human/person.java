package human;

public abstract class person {
	private String Name;
	private String Sex;
	private int Age;
	private String phone;

// default constructor of person
	public person()
	{}
//constructor of person
	public person(String Name, String Sex, int Age, String phone)
	{
		this.Name = Name;
		this.Sex = Sex;
		this.Age = Age;
		this.setPhone(phone);
	}
	
//get method of person
	public String getName(){
		return Name;
	}
	public String getSex(){
		return Sex;
	}
	public int getAge(){
		return Age;
	}
	
//set method of person
	public void setName(String Name){
		this.Name = Name;
	}
	public void setSex(String Sex){
		this.Sex = Sex;
	}
	public void setAge(int Age){
		this.Age = Age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRoll() {
		return 0;
	}
	public void getSubjects() {
		
	}
	public int getclass() {
		return 0;
	}
	
	public abstract void showDetails();
	
}














