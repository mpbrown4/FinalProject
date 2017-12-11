public class Link 
{
	//Declare fields
	public String dData; // string for song
	public Link next; // next link in list
	public int key; // number paired with song

	/**
	 * @param songNum
	 * @param song
	 * Constructor
	 */
	public Link(int songNum, String song) 
	{
		dData = song;
		key = songNum;
	}

	/**
	 * display this link
	 */
	public void displayLink() 
	{
		System.out.print(key + " " + dData + " ");
	}

	/**
	 * @return
	 * Getter
	 */
	public String getdData() {
		return dData;
	}

	/**
	 * @param dData
	 * Setter
	 */
	public void setdData(String dData) {
		this.dData = dData;
	}

	/**
	 * @return
	 * Getter
	 */
	public Link getNext() {
		return next;
	}

	/**
	 * @param next
	 * Setter
	 */
	public void setNext(Link next) {
		this.next = next;
	}

	/**
	 * @return
	 * Getter
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key
	 * Setter
	 */
	public void setKey(int key) {
		this.key = key;
	}
} // end class Link