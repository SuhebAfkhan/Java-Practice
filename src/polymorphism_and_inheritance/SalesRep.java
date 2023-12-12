package polymorphism_and_inheritance;


class SalesRep extends Employee {
	double salesMade;
    public SalesRep(String fname, String lname, int reg, int age, int days, int vacc, double sal, int years,double sales) {
		super(fname, lname, reg, age, days, vacc, sal, years);
		// TODO Auto-generated constructor stub
		this.salesMade=sales;
	}


	public double calculateComission() {
		// TODO Auto-generated method stub
		   return 0.1 * salesMade;
	}
}