package practical_1;

public class Person {
	private String Fname;
	private String Lname;
	private int age;	
	public Person(String fname, String lname, int age) {
		
		this.Fname = fname;
		this.Lname = lname;
		this.age = age;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + "]";
	}
		// TODO Auto-generated method stub
		
	}
	

