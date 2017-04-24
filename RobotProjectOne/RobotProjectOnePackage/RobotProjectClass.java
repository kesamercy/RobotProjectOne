/*
 * RobotProjectClass
 * 
 * Write a program to simulate the operation of a simple robot. The robot moves in four directions: Forward, backward,
 * right, and left. The job of the robot is to move items and place it in the right slots in each station. 
 * There is eight stations plus the pick up station. Pick up station is the initial start where the robot picks the
 * items. 8 items can be placed on each station. The nearest station must be filled before placing items on the next
 * stations. The items are marked with identification or serial numbers. The items with even serial number go to the
 * left and items with odd numbers go to the right. The last slot, number 7 reserved for light items that are less
 * than 60kg. The serial number is a five-digit number, the MSB digit 5 indicates that the product must be placed in 
 * the fifth station, which is keeping the product at 21-degree F. By receiving the message of unload, the machine 
 * should start emptying the fifth station and place the items in the refrigeration container until it is empty. 
 * There two other stations marked as 10 and 11 which each consists of 4 slots. The station 10 designated for items 
 * that are for immediate delivery and station 11 is for items that require 5 days' storage in that shelf before they 
 * can be released. Another station is marked as Station 9 used for special delivery. The slots higher than 6 require 
 * the robot to rise up to place the item.
 * 
 * Author: Ryan Ellison
 * 		   Nekesa Mercy
 * 
 * Date:	04/23/2017
 */
package RobotProjectOnePackage;

public class RobotProjectClass
{

	public static void main(String[] args)
	{
		//declare object 
		Factory factory;			//declare the object 
		
		//initialize the variable 
		factory = new Factory();
		
		//run the factory
		factory.runFactory();

	}//end main

}//end RobotProjectClass 
