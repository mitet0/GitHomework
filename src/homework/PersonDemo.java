package homework;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person [] persons = new Person[10];
		
		persons[0] = new Person("Ivan Ivanov", 28, true);
		persons[1] = new Person("Maria Markova", 16, false);
		persons[2] = new Employee("Georgi Georgiev", 14, true, 40);
		persons[3] = new Student("Gergina Galeva", 21, false, 5.5);
		persons[4] = new Student("Angel Mateev", 18, true, 4.4);
		persons[5] = new Employee("Petar Petkov", 32, true,	86);
		
		
		for (int i = 0; (persons[i] != null) && (i <= persons.length); i++) {
			if (persons[i] instanceof Employee) {
				Employee e = (Employee) persons[i];
				e.showEmployeeInfo();
			}
			else if (persons[i] instanceof Student) {
				Student s = (Student) persons[i];
				s.showStudentInfo();
			}
			else if (persons[i] instanceof Person) {
				Person p = (Person) persons[i];
				p.showPersonInfo();
			}
		}
		System.out.println();
		for (int i = 0; (persons[i] != null) && (i <= persons.length); i++) {
			if (persons[i] instanceof Employee) {
				Employee e = (Employee) persons[i];
				System.out.println("2 hours overtime sum for " + e.getName() + " is " + e.calculateOvertime(2));
			}
		}
	}

}
