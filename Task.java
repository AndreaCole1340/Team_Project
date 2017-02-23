package classes;

import java.util.ArrayList;

public class Task {

	private int taskID;
	private static int nextTaskID = 1;
	private String name;
	private final String TYPE;
	private double cost;
	private int duration;
	private ArrayList<Employee> employeesAssigned = new ArrayList<Employee>();
	
	/**
	 * 
	 * @param name
	 * @param type
	 * @param duration
	 * @param emp
	 */
	public Task(String name, String type, int duration, Employee emp) {
		this.name = name;
		this.TYPE = type;
		this.duration = duration;
		employeesAssigned.add(emp);
		taskID = nextTaskID++;
	}

	/**
	 * Accessor method for name
	 * @return
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
	 * Accessor method for duration
	 * @return
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Mutator method for duration
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Accessor method for employee IDs
	 * @return
	 */
	public int[] getEmployeesAssigned() {
		int length = employeesAssigned.size();
		int[] ids = new int[length];
		for(int i = 0; i < length; i++)
			ids[i] = employeesAssigned.get(i).getEmployeeID();
		return ids;
	}

	/**
	 * Mutator method for employee list
	 * @param employeesAssigned
	 */
	public void setEmployeesAssigned(ArrayList<Employee> employeesAssigned) {
		this.employeesAssigned = employeesAssigned;
	}

	/**
	 * Accessor method for task ID
	 * @return
	 */
	public int getTaskID() {
		return taskID;
	}

	/**
	 * Accessor method for task type
	 * @return
	 */
	public String getTYPE() {
		return TYPE;
	}

	/**
	 * Accessor method for cost
	 * @return
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Method to assign Employee to task
	 * @param emp Employee to assign
	 */
	public void assignEmployee(Employee emp){
		employeesAssigned.add(emp);
	}
	
	/**
	 * Method to calculate total cost of task
	 */
	public void calculateCost(){
		for(Employee e: employeesAssigned){
			// calculate price of each employee per day
			cost += e.getPrice();
		}
		// calculate total cost of whole task
		cost = cost * duration;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", name=" + name + ", TYPE=" + TYPE + ", cost=" + cost + ", duration="
				+ duration + ", noOfEmployeesAssigned=" + employeesAssigned.size() + "]";
	}
}
