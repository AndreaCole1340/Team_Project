package classes;

//import java.sql.Date;

public class Employee {

	//instance fields
	private static int nextEmpID = 1;
	private int employeeID;
	private String name;
	private String skillSet;
	private double price;
	private String address;
	//private Date startDate;
	
	/**
	 * Constructor for Employee
	 * 
	 * @param name
	 * @param address
	 * @param skill
	 * @param price
	 */
	public Employee(String name, String address, String skill, double price){
		employeeID = nextEmpID++;
		this.name = name;
		this.address = address;
		skillSet = skill;
		this.price = price;
	}

	/**
	 * Accessor method for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mutator method for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Accessor method for price
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Mutator method for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Accessor method for address
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Mutator method for address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Accessor method for employee ID
	 * @return empID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * Accessor method for skill
	 * @return skillSet
	 */
	public String getSkillSet() {
		return skillSet;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o)
			return true;
		if(o != null && o instanceof Employee){
			Employee employee = (Employee)o;
			return this.employeeID == employee.getEmployeeID();
		}
		
		return false;
	}
}
