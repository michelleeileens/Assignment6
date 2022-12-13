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

public class Coffee extends Beverage{
	private boolean extraShot;
	private boolean extraSyrup;
	private final double shotPrice = 0.50;
	private final double syrupPrice = 0.50;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, Type.COFFEE , size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	public boolean getExtraShot() {
		return extraShot;
	}

	public boolean getExtraSyrup() {
		return extraSyrup;
	}

	@Override
	public double calcPrice() {
		double finalPrice = addSizePrice();
		if (extraShot == true)
			finalPrice += shotPrice;
		if (extraSyrup == true)
			finalPrice += syrupPrice;
		return finalPrice;
	}
	@Override 
	public boolean equals(Object anotherBev) {
		Beverage bev = (Beverage) anotherBev;
		if (!(this.getBevName().equals(bev.getBevName())))
			return false;
		if (this.getType() != bev.getType())
			return false;
		if (this.getSize() != bev.getSize()|| this.getBasePrice() != bev.getBasePrice())
			return false;	
		Coffee coffee = (Coffee) bev;
		if (this.extraShot != coffee.getExtraShot())
			return false;
		if (this.extraSyrup != coffee.getExtraSyrup())
			return false;
		return true;
	}
	

	
	@Override 
	public String toString() {
		return getBevName() + "," + getSize() + "," + getExtraShot() + "," + getExtraSyrup() + "," + calcPrice();
	}
	
}
