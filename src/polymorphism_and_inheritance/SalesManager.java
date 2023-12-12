package polymorphism_and_inheritance;


import java.util.HashMap;
class SalesManager extends SalesRep{
	
	 private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

	    public SalesManager(String firstName, String lastName, int age, int daysWorked, int vacationDaysTaken,
	                        double salary, int yearsWorked, double salesMade) {
	        super(firstName, lastName, age, daysWorked, vacationDaysTaken, yearsWorked, salary, yearsWorked, salesMade);
	        // Additional initialization for SalesManager attributes, if any
	    }

	@Override
	public double calculateComission(){
	      return 0.03*salesMade;
	   }

}
