package polymorphism_and_inheritance;

class Employee {

	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vaccationDaysTaken;
	double salary;
	int yearsWorked;
	public Employee(String fname,String lname,int reg,int age,int days,int vacc,double sal,int years)
	{
		this.firstName=fname;
		this.lastName=lname;
		this.registration=reg;
		this.age=age;
		this.daysWorked=days;
		this.vaccationDaysTaken=vacc;
		this.salary=sal;
		this.yearsWorked=years;
	}
	
	public int timeToRetirement() {
	    int retirementAge = 65;
	    return retirementAge - age;
	}
	public int vaccationTimeLeft() {
	    int totalVacationDays = 20; // Ex: Total vacation days allowed
	    return totalVacationDays - vaccationDaysTaken;
	}
	public int calculateBonus() {
	    int baseBonus = 1000; // Base bonus amount
	    int bonusPerYear = 500; // Bonus increase per year

	    int totalBonus = baseBonus + (yearsWorked * bonusPerYear);
	    return totalBonus;
	}
	
}
