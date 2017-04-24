
/*
 * Robot
 * 
 * The purpose of this class is to create information about the Robot
 * 
 * Author: Nekesa Mercy
 * 			Ryan Ellison 
 */


package RobotProjectOnePackage;


import java.io.IOException;

public class Robot
{
	

	
	//declare varibales 
	private Item item;
	
	//default constructor 
	Robot( ){
		

		item = new Item(0, 0.0, true, false, false);

		item = null;

				
	}// end Robot
	
	/*
	 * getItem
	 * 
	 * the purpsoe of this method is to get the item
	 * 
	 * input: none 
	 * return: none
	 * 
	 */
	
	public Item getItem( ){
		
		return(item);

	}// end take
	 
	 /*
	 * take
	 * 
	 * the purpsoe of this method is to set the item attribute to the object passed
	 * 
	 * input: none 
	 * return: none
	 * 
	 */
	
	public void take(Item obj){
		
		item = obj;

	}// end take
	
	
	/*
	 * put
	 * 
	 * the purpsoe of this method is to set the item to null and return the item object
	 * 
	 * input: none 
	 * return: none
	 * 
	 */
	
	public Item put( ){
		
		Item temp;
		
		temp = item;
		
		item = null;
		
		return(temp);
	
	}// end put
 
 
	 
	/*
	 * turnLeft
	 * 
	 * the purpsoe of this method is to move the robot to the left
	 * 
	 * input: none 
	 * return: none
	 * 
	 */
	
	public void turnLeft( ){
		
		System.out.println("The robot turns to the left");
	
	}// end turnLeft
	
	/*
	 * reach
	 * 
	 * the purpsoe of this method is to move the robot to a high place in the slot
	 * 
	 * input: none 
	 * return: none
	 * 
	 */
	
	public void reach( ){
		
		System.out.println("The robot is reaching to a high place in the slots");
	
	}// end reach
	
	
	/*
	 * moveForward
	 * 
	 * the purpsoe of this method is to move the robot forward 
	 * 
	 * input: none 
	 * return: none
	 * 
	 */
	
	public void moveForward( ){
		
		System.out.println("The robot moves forward");
	
	}// end moveForward 
		
	
	/*
	 * goBackToPickUp
	 * 
	 * the purpsoe of this method is to move the robot to the pick up station
	 * 
	 * input: stationNum				// the station number 
	 * return: none
	 * 
	 */
	
	public void goBackToPickUp(int stationNum ){
		
		if(stationNum == 1)
		{
			turnLeft();
			moveForward();
		}
		else if(stationNum == 2)
		{
			turnLeft();
			turnLeft();
			turnLeft();
			moveForward();
		}
		else if(stationNum == 3)
		{
			turnLeft();
			moveForward();
			moveForward();
		}
		else if(stationNum == 4)
		{
			turnLeft();
			turnLeft();
			turnLeft();
			moveForward();
			moveForward();
		}
		else if(stationNum == 5)
		{
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
		}
		else if(stationNum == 6)
		{
			turnLeft();
			turnLeft();
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
		}
		else if(stationNum == 7)
		{
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
		}
		else if(stationNum == 8)
		{
			turnLeft();
			turnLeft();
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
		}
		else if(stationNum == 9)
		{
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
		}
		else if(stationNum == 10)
		{
			turnLeft();
			turnLeft();
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
		}
		else if(stationNum == 11)
		{
			turnLeft();
			turnLeft();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
			moveForward();
		}

		
		System.out.println("Robot back at pickup!");

	}// end goBackToPickUp
	

}// end Robot Class 
