/*
 * Class: CMSC203 21076
 * Instructor: Prof. Khandan Monshi
 * Description: creating a program for  automated order transactions and reports
 * Due: 12/12/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michelle Eileen
*/

public abstract class Beverage {
	private String bevName;
	private Type type;
	private Size size;
	
	private final double basePrice = 2.0;
	private final double priceSize = 1.0;
			
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}

	public String getBevName() {
		return bevName;
	}

	public Type getType() {
		return type;
	}

	public Size getSize() {
		return size;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double addSizePrice() {
		double finalPrice = basePrice;
		if (size == Size.MEDIUM)
			finalPrice += priceSize;
		else if (size == Size.LARGE)
			finalPrice += priceSize*2;
		return finalPrice;
	}
	
	public abstract double calcPrice();

	@Override
	public boolean equals(Object anotherBev) {
		Beverage bev = (Beverage) anotherBev;
		if (!(this.bevName.equals(bev.bevName)))
			return false;
		if (this.type != bev.type)
			return false;
		if (this.size != bev.size)
			return false;		
		return true;
	}
	
	@Override
	public String toString() {
		return bevName + "," + size;
	}
}
