
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

public class MisteryBenef extends Person{
	
	
	private int amount = 1000;
	
	public MisteriousBenefactor(Account account) {
		super(account, "A Misterious Benefactor");
	}
	
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + " wants to deposit " + amount + "€.");
			try {
				sleep(200);
				account.deposit(amount);
				sleep(2000);
			}catch(InterruptedException e){}
		}
	}
}
