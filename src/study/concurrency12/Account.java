package study.concurrency12;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized void addAmount(double amount) {
		System.out.printf("addAmount = %f \n", amount);
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp += amount;
		balance = tmp;
	}

	public synchronized void subtractAmount(double amount) {
		System.out.printf("subtractAmount = %f \n", amount);
		double tmp = balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		tmp -= amount;
		balance = tmp;
	}

}
