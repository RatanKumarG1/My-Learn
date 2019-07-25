package test;

public class Pojo {
	private int age;		
	private String name;
	private int phNo;
	
	public  int getAge() {
		return age;
	}
	public  void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	
	public String toString(){
		return "Pojo [age=" + age
				+ ", name=" + name + "]"
				+ ", phNo=" + phNo + "]";
	}
	
}
