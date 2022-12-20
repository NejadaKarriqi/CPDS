
/*Homework: FSP Models & Java Programs - BanketNoWait
*
*PotNoWait
* 
* Name: Nejada
* Surname: Karriqi
* Name: Jonnatan
* Surname: Mendoza
*
*
*/
package banketNoWait;

public class PotNoWait {
	private int servings = 0;
	private int capacity;
	
	public PotNoWait(int capacity) {
		this.capacity = capacity;
	}  //getServings is called by Savage class. 
	
	public synchronized void getServing() throws InterruptedException{
			
		if(servings == 0) {
			System.out.println(Thread.currentThread().getName() + "goes for a walk"); 
		}else {
			Thread.sleep(200);
			--servings;
			System.out.println(Thread.currentThread().getName() + " is served");
			print_servings();
		}
	}
	
	public synchronized void fillpot() throws InterruptedException{

		if(servings > 0) {
			System.out.println(Thread.currentThread().getName() + " goes for a walk");
		}else{
			System.out.println(Thread.currentThread().getName() + " is now filling the pot");
			servings = capacity;
			print_servings();
		}
	}
	public synchronized void print_servings() {
		System.out.println("Servings in the pot: " + servings);
	}
}
