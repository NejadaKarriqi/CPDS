
/*Homework: FSP Models & Java Programs - BanketNoWait
*
* 
* Name: Nejada
* Surname: Karriqi
* Name: Jonnatan
* Surname: Mendoza
*
*
*/
package banketNoWait;

/
public class Savage extends Thread{
	PotNoWait pot;
	
	public Savage(PotNoWait pot) {
		this.pot = pot;
	}
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() +
					" is hungry and would like to eat");
			try {
				Thread.sleep(200);
				this.pot.getServing();
			}catch(InterruptedException e){}
		}
	}
}
