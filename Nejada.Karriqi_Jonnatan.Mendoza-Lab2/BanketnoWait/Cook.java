
/*Homework: FSP Models & Java Programs - BanketNoWait
*
*Cook
* 
* Name: Nejada
* Surname: Karriqi
* Name: Jonnatan
* Surname: Mendoza
*
*
*/

package banketNoWait;

public class Cook extends Thread {
	PotNoWait pot;
	
	public Cook(PotNoWait pot) {
		this.pot = pot;
	}
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() +
				" wants to fill the pot");
			try {
				Thread.sleep(200);
				pot.fillpot();
			}catch(InterruptedException e) {}
		}
	}
}
