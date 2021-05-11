package Methods;

public class Student {
    int id;
    static int Noofstudents=0;
    Student(){
    	Noofstudents++;
    }
    public int noofstudents() {
    	return Noofstudents;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
