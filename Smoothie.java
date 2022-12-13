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

public class Smoothie extends Beverage{
	private int numOfFruits;
	private boolean addProtein;
	private final double fruitPrice = 0.50;
	private final double proteinPrice = 1.50;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super(bevName, Type.SMOOTHIE , size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}

	public int getNumOfFruits() {
		return numOfFruits;
	}

	public boolean getAddProtein() {
		return addProtein;
	}

	@Override
	public double calcPrice() {
		double finalPrice = addSizePrice();
		if (numOfFruits > 0) 
			finalPrice += numOfFruits * fruitPrice;
		if (addProtein == true)
			finalPrice += proteinPrice;
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
		Smoothie smoothie = (Smoothie) bev;
		if (this.numOfFruits != smoothie.getNumOfFruits())
			return false;
		if (this.addProtein != smoothie.getAddProtein())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return getBevName() + "," + getSize() + "," + getAddProtein() + "," + getNumOfFruits() + "," + calcPrice();
	}
}
