package polymorphism_and_inheritance;

public class HR_System {

	  public static void displayEmployeeInfo(Employee employee) {
	        System.out.println("Employee Information:");
	        System.out.println("Time to Retirement: " + employee.timeToRetirement());
	        System.out.println("Vacation Time Left: " + employee.vaccationTimeLeft());
	        System.out.println("Bonus: " + employee.calculateBonus());
	        System.out.println();
	    }
	  
	  public static void displaySalesRepInfo(SalesRep salesRep) {
	        System.out.println("SalesRep Information:");
	        System.out.println("Time to Retirement: " + salesRep.timeToRetirement());
	        System.out.println("Vacation Time Left: " + salesRep.vaccationTimeLeft());
	        System.out.println("Bonus: " + salesRep.calculateBonus());
	        System.out.println("Commission: " + salesRep.calculateComission());
	        System.out.println();
	    }
	  public static void displaySalesManagerInfo(SalesManager salesManager) {
	        System.out.println("SalesManager Information:");
	        System.out.println("Time to Retirement: " + salesManager.timeToRetirement());
	        System.out.println("Vacation Time Left: " + salesManager.vaccationTimeLeft());
	        System.out.println("Bonus: " + salesManager.calculateBonus());
	        System.out.println("Commission: " + salesManager.calculateComission());
	    }
	public static <SalesManager> void main(String[] args) {
		// TODO Auto-generated method stub
		  Employee employee = new Employee("John", "Doe", 112233,30, 250, 5, 50000, 8);
		  

	        // Creating a SalesRep
		  SalesRep salesRep = new SalesRep("John", "Doe", 30, 250, 5, 0, 50000.0, 5, 100000.0);
		  salesManager.addTeamMember(salesRep);

	        // Displaying information and calculations
	        displayEmployeeInfo(employee);
	        displaySalesRepInfo(salesRep);
	        displaySalesManagerInfo(salesManager);
		  
	}

}
