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

public class Alcohol extends Beverage{
	private boolean isWeekend;
	private final double weekendPrice = 0.60;
	
	public Alcohol (String bevName, Size size, boolean isWeekend) {
		super(bevName, Type.ALCOHOL , size);
		this.isWeekend = isWeekend;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	@Override
	public double calcPrice() {
		double finalPrice = addSizePrice();
		if (isWeekend == true)
			finalPrice += weekendPrice;
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
		Alcohol alcohol = (Alcohol) bev;
		if (this.isWeekend != alcohol.isWeekend())
			return false;
		return true;
	}
	
	@Override 
	public String toString() {
		return getBevName() + "," + getSize() + "," + isWeekend() + "," + calcPrice();
	}
}
