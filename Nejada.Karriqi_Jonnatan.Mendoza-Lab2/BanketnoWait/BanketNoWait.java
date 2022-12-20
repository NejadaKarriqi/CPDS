/*Homework: FSP Models & Java Programs - BanketNoWait
*
*
* 
* Name: Nejada
* Surname: Karriqi
* Name: Jonnatan
* Surname: Mendoza
*
*
*/
package CPDS

public class BanketNoWait {
	
	public static void main(String[] args) {
		PotNoWait pot = new PotNoWait (5);
		
		// Array with the savage names, number of threads created will be based on the amount of names
		// here.
		String savage_names[] = {
				"Alice",
				"Bob",
				"Peter",
				"Xana",
				"Tom",
				"Jerry",
				"Kim",
				"Berta"
		};
		
		Thread savages[] = new Savage[savage_names.length];
		Thread cook = new Cook(pot);
		cook.setName("Cook");
		
		// Create a savage instance for each one of the names and set its name
		for(int i=0; i<savage_names.length; i++) {
			savages[i] = new Savage(pot);
			savages[i].setName(savage_names[i]);
		}
		
		// Start the threads
		for(Thread s : savages){
			s.start();
		}
		cook.start();
	}
}