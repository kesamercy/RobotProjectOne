package RobotProjectOnePackage;

public class Station
{
	
	private Item items[];	// array of items
	
	/*
	 * Station()
	 * 
	 * The purpose of this constructor is to initialize all attributes according to the input.
	 * 
	 * Input:	numItems	// number of items in the station
	 * 
	 * Return:	none
	 */
	
	public Station(int numItems)
	{
		int cv;
		
		// validate numItems
		if(numItems >= 0)
		{
			items = new Item[numItems];
		}
		else
		{
			System.out.printf("ERROR: Number of items passed of %d is invalid!\n", numItems);
		}
		
		for(cv = 0; cv < items.length; ++cv)
			items[cv] = null;
	}
	
	/*
	 * isFull()
	 * 
	 * The purpose of this method is to indicate whether the Station is full of Items or not.
	 * 
	 * Input:	none
	 * 
	 * Return:	isFull	// indicates whether the Station is full or not
	 */
	
	public boolean isFull()
	{
		boolean isFull;	// indicates whether the Station is full or not
		int cv;
		
		// initialize
		isFull = false;
		
		// check if there's any empty slots
		for(cv = 0; cv < items.length; ++cv)
			if(items[cv] != null) 
				isFull = true;
		
		return isFull;
	}
	
	/*
	 * remove()
	 * 
	 * The purpose of this method is to remove an Item from its space at a given index from
	 * the Station and return the object for a Robot to take.
	 * 
	 * Input:	index	// location of the Item to remove
	 * 
	 * Return:	item	// the item removed
	 */
	
	public Item remove(int index)
	{
		Item item; // the item removed
		
		item = null;
		
		// validate the index
		if(index >= 0 && index < items.length)
		{
			item = items[index];	// get the Item to be removed
			items[index] = null;	// remove the Item
		}
		else
		{
			System.out.printf("ERROR: Index of Item to remove of %d is invalid!\n", index);
		}
		
		return item;
	}
	
	/*
	 * put()
	 * 
	 * The purpose of this method is to take an Item and put it on the space at the given index, returns false
	 * if the shelf is already full.
	 * 
	 * Input:	item	// the item to put on the shelf
	 * 			index	// the location to put the item at
	 * 
	 * Return:	isFull	// indicates whether or not the space was already full
	 */
	
	public boolean put(Item item, int index)
	{
		boolean isFull;	// indicates whether or not the space was already full
		
		// initialize
		isFull = false;
		
		// validate the index
		if(index >= 0 && index < items.length)
		{
			// check if the space is full or not
			if(items[index] == null)
				items[index] = item;	// put the Item in the space
			else
				isFull = true;
		}
		else
		{
			System.out.printf("ERROR: Index of Item to remove of %d is invalid!\n", index);
		}
		
		return isFull;
		
	}//end
	
	/*
	 * nextEmptyShelf()
	 * 
	 * The purpose of this method is to return the index of the next empty shelf.
	 * 
	 * Input:	none
	 * 
	 * Return:	nextEmptyShelf
	 */
	
	public int nextEmptyShelf()
	{
		int nextEmptyShelf;
		int cv;
		
		// initialize
		nextEmptyShelf = 0;
		
		for(cv = items.length - 1; cv >= 0; --cv)
		{
			if(items[cv] == null)
				nextEmptyShelf = cv;
		}
		
		return nextEmptyShelf;
	}

}// end Station
