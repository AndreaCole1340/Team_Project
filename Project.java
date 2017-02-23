package classes;

import java.util.ArrayList;

public class Project {

	// instance fields
	private int projectID;
	private static int nextProjectID = 1;
	private String name;
	private String startDate;
	private String endDate;
	private int noOfTasks = 0;
	private double cost;
	private int noOfEmployees = 0;
	//private int duration;
	private ArrayList<Task> tasks = new ArrayList<Task>();
	private ArrayList<Integer> idList = new ArrayList<Integer>();
	
	/**
	 * Constructor for project
	 * @param name
	 * @param startDate
	 * @param endDate
	 * @param task
	 */
	public Project(String name, String startDate, String endDate, Task task){
		projectID = nextProjectID++;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		tasks.add(task);
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
	 * Accessor method for projectID
	 * @return
	 */
	public int getProjectID() {
		return projectID;
	}
	
	/**
	 * Accessor method for startDate
	 * @return
	 */
	public String getStartDate() {
		return startDate;
	}
	
	/**
	 * Accessor method for endDate
	 * @return
	 */
	public String getEndDate() {
		return endDate;
	}
	
/*	*//**
	 * Private helper method to calc duration of project
	 *//*
	private void calculateDuration(){
		duration = endDate - startDate;
	}*/
	
	/**
	 * Accessor method for number of tasks
	 * @return
	 */
	public int getNoOfTasks() {
		return noOfTasks;
	}
	
	/**
	 * Accessor method for cost
	 * @return
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Method to calculate cost
	 */
	public void calculateCost(){
		for(Task t: tasks){
			// calculate price of each task in project
			cost += t.getCost();
		}
	}
	
	public void calculateNumberOfEmployees(){
		int[] temp;
		for(int i = 0; i < tasks.size(); i++){
			temp = tasks.get(i).getEmployeesAssigned();
			for(int j = 0; j < temp.length; j++){
				if(!idList.contains(temp[j])){
					idList.add(temp[j]);
				}
			}
		}
		noOfEmployees = idList.size();
	}
	
	public int getNoOfEmployees(){
		return noOfEmployees;
	}
}
