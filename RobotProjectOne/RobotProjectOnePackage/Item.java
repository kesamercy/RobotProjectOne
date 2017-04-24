/*
 * 
 * Item
 * 
 * The purpose of this class is to represent an Item that has a 5-digit serial number,
 * weight in kilograms, and is marked for immediate delivery or not.
 * 
 * Author(s):	Ryan Ellison
 * 				Nekesa Mercy
 * 
 * Date:		4/19/2017
 */
 


package RobotProjectOnePackage;

public class Item
{
	private int serialNumber;				// 5-digit serial number
	private double weight;					// weight in kilograms
	private boolean forImmediateDelivery;	// indicates whether the item is for immediate delivery or not
	private boolean fiveDayStorage;			// indicates whether the item is for five day storage or not
	private boolean forSpecialDelivery;		// indicates whether the item is for special delivery or not
	
	
	/*
	 * Item()
	 * 
	 * The purpose of this constructor is to initialize all variables to specified values.
	 * 
	 * Input:	serialNumber			// 5-digit serial number
	 * 			weight					// weight in kilograms
	 * 			forImmediateDelivery
	 * 
	 * Return:	none
	 */						
	
	public Item(int serialNumber, double weight, boolean forImmediateDelivery, boolean forSpecialDelivery, boolean fiveDayStorage)
	{
		if(serialNumber <= 99999 && serialNumber >= 10000)
		{
			this.serialNumber = serialNumber;
		}
		else
		{
			System.out.printf("ERROR: Invalid serial number for Item of %d!\n", serialNumber);
			this.serialNumber = 10000;
		}
		
		if(weight >= 0.0)
		{
			this.weight = weight;
		}
		else
		{
			System.out.printf("ERROR: Invalid weight for Item of %f!\n", weight);
			this.weight = 80.0;
		}
		
		this.forImmediateDelivery = forImmediateDelivery;
		this.forSpecialDelivery = forSpecialDelivery;
		this.fiveDayStorage = fiveDayStorage;
	}
	
	/*
	 * getSerialNumber()
	 * 
	 * The purpose of this method is to return the serialNumber attribute.
	 * 
	 * Input:	none
	 * 
	 * Return:	serialNumber	// the serial number
	 */
	
	public int getSerialNumber()
	{
		return serialNumber;
	}
	
	/*
	 * getForSpecialDelivery()
	 * 
	 * The purpose of this method is to return the forSpecialDelivery attribute.
	 * 
	 * Input:	none
	 * 
	 * Return:	forSpecialDelivery	// the forSpecialDelivery
	 */
	
	public boolean getForSpecialDelivery()
	{
		return forSpecialDelivery;
	}
	
	
	
	/*
	 * getWeight()
	 * 
	 * The purpose of this method is to return the weight attribute.
	 * 
	 * Input:	none
	 * 
	 * Return:	weight	// the weight
	 */
	
	public double getWeight()
	{
		return weight;
	}
	
	/*
	 * getForImmediateDelivery()
	 * 
	 * The purpose of this method is to return the forImmediateDelivery attribute.
	 * 
	 * Input:	none
	 * 
	 * Return:	forImmediateDelivery	// indicates whether the item is for immediate delivery or not
	 */
	
	public boolean getForImmediateDelivery()
	{
		return forImmediateDelivery;
	}
	
	/*
	 * getFiveDayStorage()
	 * 
	 * The purpose of this method is to return the forFiveDayStorage attribute.
	 * 
	 * Input:	none
	 * 
	 * Return:	fiveDayStorage	// indicates whether the item is for five day storage or not
	 */
	
	public boolean getFiveDayStorage()
	{
		return fiveDayStorage;
	}
	
	/*
	 * getForSpecialDelivery()
	 * 
	 * The purpose of this method is to return the forSpecialDelivery attribute.
	 * 
	 * Input:	none
	 * 
	 * Return:	forSpecialDelivery	// indicates whether the item is for special delivery or not
	 */
	
	public boolean forSpecialDelivery()
	{
		return forSpecialDelivery;
	}
	
	/*
	 * serialNumberIsEven()
	 * 
	 * The purpose of this method is to indicate whether the serial number is even or not.
	 * 
	 * Input:	none
	 * 
	 * Return:	isEven	// indicates whether the serial number is even or not
	 */
	
	public boolean serialNumberIsEven()
	{
		boolean isEven;		// indicates whether the serial number is even or not
		
		// initialize
		isEven = false;
		
		if((serialNumber % 2) == 0) isEven = true;
		
		return isEven;
		
	}
	
	/*
	 * getMostSignificantDigit()
	 * 
	 * The purpose of this method is to calculate and return the most significant digit
	 * of the serial number.
	 * 
	 * Input:	none
	 * 
	 * Return:	mostSignificantDigit	// the most significant digit of the serial number
	 */
	
	public int getMostSignificantDigit() // it would be helpful to have an input variable - whcih would be the item number
	{
		int mostSignificantDigit;	// the most significant digit of the serial number
		
		mostSignificantDigit = 0;
		
		mostSignificantDigit = serialNumber / 10000;
		
		return mostSignificantDigit;

	}// end 
	
}// end ItemClass
