public class List // class FirstLastList
{
	//Declare fields
	private Link first; 
	private Link last;

	/**
	 * constructor
	 */
	public List() 
	{
		first = null; // no links on list yet
		last = null;
	}

	/**
	 * @return
	 * true if no links
	 */
	public boolean isEmpty() 
	{
		return first == null;
	}

	/**
	 * @param key
	 * @param song
	 * insert at front of list
	 */
	public void insertFirst(int key, String song) 
	{
		Link newLink = new Link(key, song); // make new link
		if (isEmpty()) // if empty list,
			last = newLink; // newLink <-- last
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	/**
	 * @param key
	 * @param song
	 * insert at end of list
	 */
	public void insertLast(int key, String song) 
	{
		Link newLink = new Link(key, song); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.next = newLink; // old last --> newLink
		last = newLink; // newLink <-- last
	}

	/**
	 * @return
	 * Delete first link
	 */
	public String deleteFirst() 
	{ // (assumes non-empty list)
		String temp = first.dData;
		if (first.next == null) // if only one item

			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

	/**
	 * Display list 
	 */
	public void displayList() {
		System.out.print("List of songs (first-->last): \n");
		Link current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}

	public String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}//////////////////////////////////////////////////////////////////////////////

	public void sort() {
		// TODO Auto-generated method stub
		
	}////////////////////////////////////////////////////////////////////////////////

	public String size() {
		// TODO Auto-generated method stub
		return null;///////////////////////////////////////////////////////////////////
	}

} // end class FirstLastList