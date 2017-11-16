public class List // class FirstLastList
{
	//Declare fields
	private Link first; 
	private Link last;

	public List() // constructor
	{
		first = null; // no links on list yet
		last = null;
	}

	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

	public void insertFirst(int key, String song) // insert at front of list
	{
		Link newLink = new Link(key, song); // make new link
		if (isEmpty()) // if empty list,
			last = newLink; // newLink <-- last
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	public void insertLast(int key, String song) // insert at end of list
	{
		Link newLink = new Link(key, song); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.next = newLink; // old last --> newLink
		last = newLink; // newLink <-- last
	}

	public String deleteFirst() // delete first link
	{ // (assumes non-empty list)
		String temp = first.dData;
		if (first.next == null) // if only one item

			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

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

} // end class FirstLastList