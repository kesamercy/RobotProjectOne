package RobotProjectOnePackage;

public class Factory
{
	
	private Station mainStations[];				// first eight stations 
	private Robot robot;						// the robot object 
	private Station refContainer;				// the refrigration container 
	private Station pickUp;						// the pickup station object 
	
	/*
	 * constructor
	 * 
	 * the purpose of this method is to initalize all attributes 
	 * 
	 * input: none
	 * return: none
	 */
	public Factory()
	{
		//declare variables 
		int cntr;							// the counter 
		
		robot = new Robot();
		refContainer = new Station(8);
		pickUp = new Station(20);
		
		mainStations = new Station[11];
		
		for (cntr =0; cntr < 8; ++cntr){
			
			mainStations[cntr] = new Station(11);
			
		
			
		}// end for 
		
		mainStations[8] = new Station(4);
		mainStations[9] = new Station(4);
		mainStations[10] = new Station(4);
		
		// put all the initial items in
		pickUp.put(new Item(10009, 90.0, false, false, true), 0);
		pickUp.put(new Item(50000, 85.0, false, false, false), 1);
		pickUp.put(new Item(60032, 90.0, false, false, false), 2);
		pickUp.put(new Item(60033, 92.0, false, false, false), 3);
		pickUp.put(new Item(60034, 75.0, false, true, false), 4);
		pickUp.put(new Item(50056, 105.0, false, false, false), 5);
		pickUp.put(new Item(70032, 30.0, false, true, false), 6);
		pickUp.put(new Item(60099, 82.0, true, false, false), 7);
		pickUp.put(new Item(60039, 60.0, false, false, false), 8);
		pickUp.put(new Item(50040, 85.0, false, false, false), 9);
		pickUp.put(new Item(60010, 20.0, false, false, false), 10);
		pickUp.put(new Item(80090, 88.0, true, false, false), 11);
		pickUp.put(new Item(60074, 150.0, false, false, false), 12);
		pickUp.put(new Item(90077, 120.0, false, true, false), 13);
		pickUp.put(new Item(60078, 94.0, false, false, false), 14);
		pickUp.put(new Item(60080, 55.0, false, false, false), 15);
		pickUp.put(new Item(50034, 67.0, false, false, false), 16);
		pickUp.put(new Item(80035, 99.0, true, false, false), 17);
		pickUp.put(new Item(60066, 78.0, false, false, true), 18);
		pickUp.put(new Item(60077, 200.0, false, false, false), 19);
		
		 
		 
		 
		 
		
	}// end constructor 
	
	/*
	 * getRefContainer
	 * 
	 * the purpose of this method is to get the refrigrator container
	 * 
	 * input : none
	 * return: refContainer
	 */
	public Station getRefContainer(){
		
		return(refContainer);
	}// end getRefContainer
	
	/*
	 * getRobot
	 * 
	 * the purpose of this method is to get the robot
	 * 
	 * input : none
	 * return: robot
	 */
	public Robot getRobot(){
		
		return(robot);
	}// end getRobot
	
	
	/*
	 * getpickUp
	 * 
	 * the purpose of this method is to get the items to be picked up
	 * 
	 * input : none
	 * return: pickUp
	 */
	public Station getPickUp(){
		
		return(pickUp);
	}// end getPickUp
	
	
	/*
	 * unload
	 * 
	 * the purpose of this method is take everything from station 5 and put in the refrigeration container. 
	 * 
	 * input: none
	 * return: none
	 */	
	public void unload( ){
		
		int currentLocation;
		
		currentLocation = 0;
		
		System.out.println("\n\nRobot now unloading!\n\n");
		
		// continue to run while the 5th station is full
		while(mainStations[4].isFull())
		{
			
			if(currentLocation > 6) robot.reach();
			System.out.println("The robot picks an item!");
			robot.take(mainStations[4].remove(currentLocation));
			
			// robot now facing refrigeration unit
			robot.turnLeft();
			robot.turnLeft();
			robot.turnLeft();
			
			// have robot move to refrigeration unit
			robot.moveForward();
			robot.moveForward();
			robot.moveForward();
			robot.moveForward();
			
			
			// have robot put its item in station five
			if(currentLocation > 6) robot.reach();
			System.out.println("The robot puts the item!");
			refContainer.put(robot.put(), currentLocation);
			
			// turn around
			robot.turnLeft();
			robot.turnLeft();
			robot.turnLeft();
			
			// move to fifth station
			robot.moveForward();
			robot.moveForward();
			robot.moveForward();
			robot.moveForward();
			
			// have robot face 5th station
			robot.turnLeft();
			
			++currentLocation;
		}// end while
		
	}// end unload
	

	/*
	 * runFactory
	 * 
	 * the purpose of this method is to run the factory 
	 * 
	 * input: none
	 * return: none
	 */	
	 public void runFactory( ){
		 
		 // ATTENTION:
		 // Don't JUST do what i commented to do, it's just a guide to help you get started, make sure it works
		 // as said in the problem statement,
		 // make sure to test the program a lot, make sure when you put an item in a station you start at the 
		 // lowest shelf and work your way up (add more variables
		 // to keep track)
		 
		int currentPickUpSpace;

		int cntr;
		int i;
		
		currentPickUpSpace = 0;

		i = 0;
				
		
		
		while(pickUp.isFull())
		{
			if(currentPickUpSpace > 6) robot.reach();
			System.out.println("The robot picks an item!");
			robot.take(pickUp.remove(currentPickUpSpace));
			
			++currentPickUpSpace;
			
			if(robot.getItem().getForImmediateDelivery())
			{
				// needs to go to station 10
				robot.turnLeft();
				robot.turnLeft();
				
				// goes to station 10
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				
				// now facing station 10
				robot.turnLeft();
				
				if(mainStations[9].nextEmptyShelf() > 6) robot.reach();
				System.out.println("The robot puts its item in the station!");
				mainStations[9].put(robot.put(), mainStations[9].nextEmptyShelf());
				robot.goBackToPickUp(9);
				
				
			}
			else if(robot.getItem().getForSpecialDelivery())
			{
				// needs to go to station 9
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.turnLeft();
				
				if(mainStations[8].nextEmptyShelf() > 6) robot.reach();
				System.out.println("The robot puts its item in the station!");
				mainStations[8].put(robot.put(), mainStations[8].nextEmptyShelf());
				robot.goBackToPickUp(8);
				
			}
			else if(robot.getItem().getFiveDayStorage())
			{
				// needs to go to station 11
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.turnLeft();
				robot.turnLeft();
				robot.turnLeft();
				
				if(mainStations[10].nextEmptyShelf() > 6) robot.reach();
				System.out.println("The robot puts its item in the station!");
				mainStations[10].put(robot.put(), mainStations[10].nextEmptyShelf());
				robot.goBackToPickUp(10);
				
			}
			else if(robot.getItem().getMostSignificantDigit() == 5)
			{
				// needs to go to station 5
				robot.moveForward();
				robot.moveForward();
				robot.moveForward();
				robot.turnLeft();
				
				if(mainStations[4].nextEmptyShelf() > 6) robot.reach();
				System.out.println("The robot puts its item in the station!");
				mainStations[4].put(robot.put(), mainStations[4].nextEmptyShelf());
				robot.goBackToPickUp(4);
			}
			else
			{
				// check if serial number is even, if so find the closest non-empty station on the left and put it there
				if(robot.getItem().serialNumberIsEven()){
					
					i = 0;
					//check for space in stations
					for(cntr = 1; cntr < mainStations.length; cntr += 2){
						if(!mainStations[cntr].isFull() ){
							
							while(i < cntr ){
							robot.moveForward();
							++i;
							}// end while 
							robot.turnLeft();
							robot.turnLeft();
							robot.turnLeft();
							mainStations[cntr].put(robot.put(), mainStations[cntr].nextEmptyShelf());
							System.out.println("The robot puts its item in the station!");
							robot.goBackToPickUp(cntr);
						}// end if 
						
						
					}// end for 	
					
				}// end if 
				
				else{
					
					//check for space in stations
					for(cntr = 0; cntr < mainStations.length; cntr += 2){
						i = 0;
						if(!mainStations[cntr].isFull()){
							
							while(i < cntr ){
								
							robot.moveForward();
							++i;
							}// end while 
							robot.turnLeft();
							mainStations[cntr].put(robot.put(), mainStations[cntr].nextEmptyShelf());
							System.out.println("The robot puts its item in the station!");
							robot.goBackToPickUp(cntr);
							
						}// end if 
						
			
					}// end for 	
					
				
				}// end else 	
					
					
				
			}
			
		}
		
		unload();
		
	 }// end runFacotry
	 
	 
		

	

}// end Factory class 
