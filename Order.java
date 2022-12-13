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

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{

	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> beverages;
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		super();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		this.beverages = new ArrayList<Beverage>();
	}
	
	public int getOrderNo() {
		return orderNo;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public Day getOrderDay() {
		return orderDay;
	}

	public Customer getCustomer() {
		return new Customer(cust);
	}
	
	public int getTotalItems() {
		return beverages.size();
	}
	
	public Day[] getDay() {
		return Day.values();
	}

	public boolean isWeekend() {
		if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
			return true;
		return false;
	}

	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}
	
	public Beverage getBeverage(int itemNo) {
		return beverages.get(itemNo);
	}
	
	public void addNewBeverage(String bevName, Size size) {
		boolean isWeekend = false;
        if (orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
                isWeekend = true;
        }
        Alcohol a = new Alcohol(bevName, size, isWeekend);
        beverages.add(a);
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        Coffee c = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(c);
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Smoothie s = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(s);
	}
	
	public double calcOrderTotal() {
		 double orderTotal = 0;
         for (Beverage b : beverages) {
                 orderTotal += b.calcPrice();
         }
         return orderTotal;
	}
	
	@Override
	public int compareTo(Order anotherOrder) {
		 if (orderNo == anotherOrder.getOrderNo()) 
			 return 0;
		 else if (orderNo > anotherOrder.getOrderNo())
			 return 1;
		 else 
             return -1;
	}
	
	public int findNumOfBeveType(Type type) {
		int count = 0;
        for (Beverage b : beverages) {
                if (b.getType() == type) {
                        count++;
                }
        }
        return count;
	}
	
	public int generateOrder() {
		  Random rand = new Random();
          int randInt = rand.nextInt(90000-10000)+10000;
          return randInt;
	}
	
	@Override
	public String toString() {
		String list = "{ ";
		for (Beverage b : beverages) {
			list += b.toString() + " ";
		}
		list += " }";
		return orderNo + "," +  orderTime + "," + orderDay.toString() + "," + cust.getName() + "," + cust.getAge() + "," + list;
	}

}
