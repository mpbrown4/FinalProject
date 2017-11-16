public class Link 
{
	//Declare fields
	public String dData; // string for song
	public Link next; // next link in list
	public int key; // number paired with song

	public Link(int songNum ,String song) // constructor
	{
		dData = song;
		key = songNum;
	}

	public void displayLink() // display this link
	{
		System.out.print(key + " " + dData + " ");
	}

	public String getdData() {
		return dData;
	}

	public void setdData(String dData) {
		this.dData = dData;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	
	

} // end class Link