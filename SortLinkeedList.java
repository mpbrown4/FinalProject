
public class SortLinkeedList {
	// Declare fields
	private static int counter;
	private Node head;

	/**
	 * Default constructor
	 */
	public void SortLinkedList() {

	}

	/**
	 * @param key
	 * @param song
	 * adds the specified element to the end of list
	 */
	public void add(Integer key, String song) {

		// Initialize Node if it is 1st element
		if (head == null) {
			head = new Node(key, song);
		}

		Node sortTemp = new Node(key, song);
		Node sortCurrent = head;

		// Check for Null Pointer Exception
		if (sortCurrent != null) 
		{
			// starting at head node, go to end of list and add element after last node
			while (sortCurrent.getNext() != null) {
				sortCurrent = sortCurrent.getNext();
			}
			// the last node's "next" reference set to new node
			sortCurrent.setNext(sortTemp);
		}
		// increment the num of elements var
		incrementCounter();
	}

	/**
	 * @return
	 * get counter
	 */
	private static int getCounter() {
		return counter;
	}

	/**
	 * method to increment counter
	 */
	private static void incrementCounter() {
		counter++;
	}

	/**
	 * method to decrement counter
	 */
	private void decrementCounter() {
		counter--;
	}

	/**
	 * @param key
	 * @param song
	 * @param index
	 * inserts the specified element at the specified position in list
	 */
	public void add(Integer key, String song, int index) {
		Node sortTemp = new Node(key, song);
		Node sortCurrent = head;

		// Check for NPE 
		if (sortCurrent != null) {
			// Requested index or last element in the list, whichever comes first
			for (int i = 0; i < index && sortCurrent.getNext() != null; i++) {
				sortCurrent = sortCurrent.getNext();
			}
		}

		// Set new node's next-node reference to this node's next-node reference
		sortTemp.setNext(sortCurrent.getNext());

		// Set this node's next-node reference to new node
		sortCurrent.setNext(sortTemp);

		// increment
		incrementCounter();
	}

	/**
	 * @param index
	 * @return
	 * returns element at a specific position
	 */
	public Object get(int index)
	{
		// index must be 1 or higher
		String output = "";
		if (index < 0)
			return null;
		Node sortCurrent = null;
		if (head != null) {
			sortCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (sortCurrent.getNext() == null)
					return null;
				sortCurrent = sortCurrent.getNext();
			}
			output += "[" + sortCurrent.getKey().toString() + ". " + sortCurrent.getSong().toString() + "]";
			return output;
		}
		return sortCurrent;
	}

	/**
	 * @param index
	 * @return
	 * returns element at a specific position
	 */
	public Integer getSongNum(int index)
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node sortCurrent = null;
		if (head != null) {
			sortCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (sortCurrent.getNext() == null)
					return null;

				sortCurrent = sortCurrent.getNext();
			}
			return sortCurrent.getKey();
		}
		return sortCurrent.getKey();
	}

	/**
	 * @param index
	 * @return
	 * returns element at a specific position
	 */
	public String getSong(int index)
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node sortCurrent = null;
		if (head != null) {
			sortCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (sortCurrent.getNext() == null)
					return null;

				sortCurrent = sortCurrent.getNext();
			}
			return sortCurrent.getSong();
		}
		return sortCurrent.getSong();

	}

	/**
	 * @param index
	 * @return
	 * removes element at a specific position
	 */
	public boolean remove(int index) {
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node sortCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (sortCurrent.getNext() == null)
					return false;

				sortCurrent = sortCurrent.getNext();
			}
			sortCurrent.setNext(sortCurrent.getNext().getNext());

			// decrement 
			decrementCounter();
			return true;
		}
		return false;
	}

	/**
	 * @return
	 * returns number of elements
	 */
	public Node getHead() {
		return head;
	}

	public int size() {
		return getCounter();
	}

	/**
	 * Sorting method
	 */
	public void sort() {
		if (size() > 1) {
			boolean wasChanged;
			do {
				Node current = getHead();
				Node previous = null;
				Node next = getHead().getNext();
				wasChanged = false;

				while (next != null) {
					if (current.getKey() > next.getKey()) {
						wasChanged = true;

						if (previous != null) {
							Node sig = next.getNext();

							previous.setNext(next);
							next.setNext(current);
							current.setNext(sig);
						} else {
							Node sig = next.getNext();

							head = next;
							next.setNext(current);
							current.setNext(sig);
						}

						previous = next;
						next = current.getNext();
					} else {
						previous = current;
						current = next;
						next = next.getNext();
					}
				}
			} while (wasChanged);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * ToString method
	 */
	public String toString() {
		String output = "";

		if (head != null) {
			Node sortCurrent = head.getNext();
			while (sortCurrent != null) {
				output += "[" + sortCurrent.getKey().toString() + ". " + sortCurrent.getSong().toString() + "]";
				sortCurrent = sortCurrent.getNext();
			}
		}
		return output;
	}

	/**
	 * @author Madison
	 *node class
	 */
	private class Node {
		// reference to next node in the chain, or null if there isn't one.
		Node next;
		Integer key;
		String song;

		/**
		 * @param songNum
		 * @param songName
		 * Constructor for Node
		 */
		public Node(Integer songNum, String songName) {
			next = null;
			key = songNum;
			song = songName;
		}

		/**
		 * @param songNum
		 * @param songName
		 * @param nextValue
		 * Node constructor to specify a specific node
		 */
		@SuppressWarnings("unused")
		public Node(Integer songNum, String songName, Node nextValue) {
			next = nextValue;
			key = songNum;
			song = songName;
		}

		/**
		 * @return Get key
		 */
		public Integer getKey() {
			return key;
		}

		/**
		 * @return
		 * Get song
		 */
		public String getSong() {
			return song;
		}

		/**
		 * @param songNum
		 * Setter
		 */
		@SuppressWarnings("unused")
		public void setNum(Integer songNum) {
			key = songNum;
		}

		/**
		 * @param songName
		 * Setter
		 */
		public void setSong(String songName) {
			song = songName;
		}

		/**
		 * @return
		 * Getter
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param nextValue
		 * Setter
		 */
		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}
