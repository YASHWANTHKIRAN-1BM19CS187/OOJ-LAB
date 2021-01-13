import java.util.*;
import java.lang.*;

class wrongyear extends Exception {
	String s;
	int n;
	wrongyear(String s, int n) {
		this.s = s;
		this.n = n;
		System.out.println("--invalid reenter correct value " + s + n);
	}

	public String toString() {
		return "wrongyear exception.";
	}
}

class Company {
	Scanner s = new Scanner(System.in);
	int yoj;
	Company() throws wrongyear{
		System.out.println("Enter year of joining: ");
		yoj = s.nextInt();
		if (yoj < 2005) {
			throw new wrongyear("Year of joining is invalid! ", yoj);
		}
	}

	public void display() {
		System.out.println("The Year of Joining is: " + yoj);
	}
}

class Employee extends Company {
	Scanner s = new Scanner(System.in);
	int age;
	public Employee() throws wrongyear {
		System.out.println("Enter your age: ");
		age = s.nextInt();
		if (age < 18 || age > 60) {
			throw new wrongyear("Age cannot be less than 18 or more than 60 ", age);
		}
	}

	public void display_emp() {
		System.out.println("the Age is: " + age);
	}
}

class empcomp {
	public static void main(String[] args) {
		try{
			Employee e = new Employee();
			e.display();
			e.display_emp();
		} catch(wrongyear n) {
			System.out.println(n);
		}
	}
}
