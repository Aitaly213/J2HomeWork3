package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;

    }

    public double deposit(double sum) {
        System.out.println(amount+= sum);
        return amount ;
    }

    public void withDraw(int sum) throws LimitException {
        for (int i = 0; i < getAmount(); i++) {
          if (amount - sum < 0) {
            throw new LimitException("U vas nedostatochno sredstv", sum);
          } if(amount - sum > 0) {
            System.out.println("zaprashevaemaya summa: " + sum);
            System.out.println(amount -= sum);
          }
      }
    }
}
