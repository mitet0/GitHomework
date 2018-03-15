package homework;

public class Person {
	private String name;
	private int age;
	private boolean isMan;
	
	public Person(String name, int age, boolean isMan) {
		this.setName(name);
		this.setAge(age);
		this.setIsMan(isMan);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null ) {
			this.name = name;
		}
		else {
			System.out.println("Name should be long at least 1 character!");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
		else {
			System.out.println("Enter valid age!");
		}
	}
	public boolean getIsMan() {
		return isMan;
	}
	public void setIsMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	public void showPersonInfo() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Person \t\t[Name: " + getName() + ",\tAge: " + getAge() + ",\tMale: " + getIsMan() + "]";
	}
	
	
}
