package homework;

public class Student extends Person {
	
	private double score;
	
	public Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.setScore(score);		
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
		else {
			System.out.println("Invalid score!");
		}
	}

	public void showStudentInfo() {
		System.out.println(this.toString());
	}

	public String toString() {
		return "Student \t[Name: " + getName() + ",\tAge: " + getAge()
				+ ",\tMale: " + getIsMan() + ",\tScore: " + getScore() + "]";
	}
	

}
