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
public class SavingAccount {
	
	public static void main(String[] args) {
		
		Account savingAccount = new Account();
		Thread alice = new Person(savingAccount, "Alice");
		Thread bob = new Person(savingAccount, "Bob");
		Thread mb = new MisteriousBenefactor(savingAccount);
		
                /Threads
		alice.start();
		bob.start();
		mb.start();
	}
}