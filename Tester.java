public class Tester 
{
	public static void main(String[] args) 
	{
		List theList = new List();
		theList.insertFirst(2, "Mambo Salsa \n"); // insert at front
		theList.insertFirst(5, "Chacha Swing \n");
		theList.insertFirst(8, "Voy A Marte \n");
		theList.insertFirst(10, "Work \n");
		theList.insertFirst(4, "Bambalam \n");
		theList.insertFirst(6, "Zumba Loco \n");
		theList.insertFirst(3, "Dale Fuego \n");
		theList.insertFirst(7, "Uptown Funk \n");
		theList.insertFirst(11, "El Amor, El Amor \n");
		theList.insertFirst(1, "Limbo \n");
		theList.insertFirst(9, "Menea La Pera \n");
		theList.insertFirst(13, "Gimme Five \n");
		theList.insertFirst(12, "Metala Sacala \n"); 
		theList.insertFirst(14, "Waka Waka \n");
		theList.insertFirst(15, " All Around the World \n");
		theList.displayList(); // display the list
		theList.deleteFirst();
		theList.displayList(); // display again
	}// end main()
}// end class Tester
