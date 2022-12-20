
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
import java.util.Random;

/
public class Person extends Thread{
	Account account;
	Random r = new Random();
	
	public Person(Account account, String name) {
		this.account = account;
		this.setName(name);
	}
	

	public void run() {
		int amount;
		while(true) {
			
			amount = r.nextInt(1200);
			//Deposit money
			if(r.nextBoolean()) {
				System.out.println(Thread.currentThread().getName() + " wants to deposit " + amount + "€");
				try {
					sleep(200);
					account.deposit(amount);
				}catch(InterruptedException e) {}
			// Withdraw money
			}else{
				System.out.println(Thread.currentThread().getName() + " wants to withdraw " + amount + "€");
				try {
					sleep(200);
					account.withdraw(amount);
				}catch(InterruptedException e) {}
			}
		}
	}
}
