
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


public class Account {
	int funds = 0;
	
	//  avoid multiple access issues by synchronizing it.
	// Once the deposit is completed, it notifies all threads.
	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " deposited " + amount + "€");
		funds += amount;
		notifyAll();
	}
	
	public synchronized void withdraw(int amount) throws InterruptedException{
		while(funds <= amount){
			System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " €, but "
					+ "there are not enough funds in the savings account!");
			wait();
		}
		funds -= amount;
		System.out.println(Thread.currentThread().getName() + " withdrew " + amount + "€.");
		print_funds();
		
	}
	

	synchronized void print_funds() {
		System.out.println("Savings Account's Current funds: " + funds + "€.");
	}
}
