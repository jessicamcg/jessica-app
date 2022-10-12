// iii)Create a Bank class with methods deposit & withdraw. 
// The deposit method would accept attributes amount & balance ( returns the new balance which
// is the sum of amount & balance. Similarly the withdraw method would accept the attributes amount & balance & returns the new balance
// if(balance >=amount or return 0 otherwise

package com.jessica;

public class Bank {
  public static void main(String[] args) {
    Bank b = new Bank(70.00);
    b.deposit(30.00);
    System.out.println("new balance: " + b.getBalance());
    b.withdraw(50.00);
    System.out.println("new balance: " + b.getBalance());
    b.withdraw(80.00);
    System.out.println("new balance: " + b.getBalance());
  }
  
  private double balance;

  public Bank(double balance) {
    this.setBalance(balance);
    System.out.println("new bank account created. balance: " + this.balance);
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double deposit(double amount) { 
    System.out.println("depositing " + amount);

    double newBalance = this.balance + amount;
    this.setBalance(newBalance);
    return this.balance;
  }

  public double withdraw(double amount) {
    if (this.balance>=amount) {
      System.out.println("withdrawing " + amount);
      double newBalance = this.balance - amount;
      this.setBalance(newBalance);
      return this.balance;
    } else {
      System.out.println("overdrawn");
      this.setBalance(0);
      return this.balance;
    }

  }
}
