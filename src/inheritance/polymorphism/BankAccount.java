package inheritance.polymorphism;

import java.util.Scanner;

//Account class
class Account {
	Person accountHolder;
	private long accountNumber;
	double balance;

	void deposit(double amount) {
		setBalance(balance + amount);
	}

	void withdraw(double amount) {
		setBalance(balance - amount);
	}

	public Person getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(Person accountHolder, double balance) {
		super();
		final long max = 40000000000L;
		final long min = 20000000000L;
		this.accountHolder = accountHolder;
		this.setAccountNumber((long) (Math.random() * (max - min) + min));
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	private void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
}

class Person {
	String name;
	float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		if (age > 18) {
			this.age = age;
		} else {
			System.out.println("Account Holder must be adult");
			System.exit(0);
		}

	}

	public Person(String name, float age) {
		super();
		this.name = name;
		setAge(age);
	}

}

class BankAccount {

	public static void main(String args[]) {
		final Scanner sc = new Scanner(System.in);
		// Details of Smith
		System.out.println("please enter name ");
		final String name1 = sc.next();
		System.out.println("Please enter age");
		final float age1 = sc.nextFloat();
		final Person smith = new Person(name1, age1);

		System.out.println("Please enter the initial balance ");
		final double balance1 = sc.nextDouble();

		final Account accountSmith = new Account(smith, balance1);
		// Details of Kathy
		System.out.println("please enter name ");
		final String name2 = sc.next();
		System.out.println("Please enter age");
		final float age2 = sc.nextFloat();
		System.out.println("Please enter the initial balance ");
		final double balance2 = sc.nextDouble();

		final Person kathy = new Person(name2, age2);
		final Account accountKathy = new Account(kathy, balance2);

		accountSmith.deposit(2000);
		accountKathy.withdraw(2000);
		System.out.println(accountKathy.getBalance());
		System.out.println(accountSmith.getBalance());
		sc.close();

	}
}