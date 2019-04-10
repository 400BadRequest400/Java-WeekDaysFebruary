package oop;

public class ConcreteCar extends AbstractCar implements InterfaceCar,InterfaceCar2 {
    //implements -- interface
	//extends -- abstract 
	//extends first than implements
	
	@Override
	public void start() {
		
		
	}

	@Override
	public void stop() {
		
		
	}

	@Override
	public void move() {
		System.out.println("moving functionnality --generating car concrete--coming from interface");
		autoBreak();
	
	}
@Override
	public void light() {
	
		
	}
public void autoHeadLight(int a) {
    System.out.println(a+ "headlight -- polymorphism class");
}
}
