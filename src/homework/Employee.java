package homework;

public class Employee extends Person {
	
	double daySalary;

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
		else {
			System.out.println("Wrong Salary!");
		}
	}
	
	public Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		setDaySalary(daySalary);		
	}
	
	protected double calculateOvertime(double hours) {
		if (this.getAge() < 18) {
			return 0;
		}
		else {
			return ((this.getDaySalary() / 8) * (hours * 1.5));
		}
	}
	
	public String toString() {
		return "Employee \t[Name: " + getName() + ",\tAge: " + getAge()
				+ ",\tMale: " + getIsMan() + ",\tSalary: " + getDaySalary() + "]";
	}
	
	public void showEmployeeInfo() {
		System.out.println(this.toString());
	}

}
