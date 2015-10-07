package VehicleProject;

public abstract class Vehicle {
	public Vehicle(){
		System.out.println("A vehicle has been created.");
	}
	public void Starts(){
		System.out.println("A vehicle starts.");
	}
	public void Stops(){
		System.out.println("A vehicle stops.");
	}
	public void Accelerate(){
		System.out.println("A vehicle accelerates.");
	}
}
