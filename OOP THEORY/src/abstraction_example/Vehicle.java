
package abstraction_example;

public abstract class Vehicle {
	
	public Vehicle(){
		System.out.println("Vehicle Created!");
	}
	
	public abstract void move();
	
	public void carry() {
		System.out.println("All Vehicle carry Loads");
	}
}	

