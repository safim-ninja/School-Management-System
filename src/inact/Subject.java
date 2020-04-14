package inact;

public class Subject {
	public String [][] sub = {
			
/* for class 1	*/	{"Bangla", "English", "Math"},
/* for class 2	*/	{"Bangla", "English", "Math", "General Knowledge"},
/* for class 3	*/	{"Bangla", "English", "Math", "General Knowledge", "Social Science"},
/* for class 4	*/	{"Bangla", "English", "Math", "General Knowledge", "Social Science", "Science"},
/* for class 5	*/	{"Bangla", "English", "Math", "General Knowledge", "Social Science", "Science"},
/* for class 6	*/	{"B1", "B2", "E1", "E2",  "Math", "Social Science", "Science", "ICT", "physical Studies"},
/* for class 7	*/	{"B1", "B2", "E1", "E2",  "Math", "Social Science", "Science", "ICT", "physical Studies"},
/* for class 8	*/	{"B1", "B2", "E1", "E2",  "Math", "Social Science", "Science", "ICT", "physical Studies"},
/* for class 9	*/	{"B1", "B2", "E1", "E2",  "Math", "Biology", "Chemistry", "Physics", "Social Science", "Science", "ICT", "physical Studies"},
/* for class 10	*/	{"B1", "B2", "E1", "E2",  "Math", "Biology", "Chemistry", "Physics", "Social Science", "Science", "ICT", "physical Studies"},
	
	};
	
	public Subject()
	{
		
	}
	
	public void printSub(int n)
	{
		for(int i=0; i<sub[n-1].length; i++)
		{
			System.out.println((i+1) + ". " + sub[n-1][i]);
		}
	}

	
}
