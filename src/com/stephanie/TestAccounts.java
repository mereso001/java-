package com.stephanie;

public class TestAccounts {
    public static void main(String[] args) {
        Account acc1 = new Account("Mary","001",40000);
        Account acc2 = new Account("Mercy","002",3000);
        Account acc3 = new Account("Mark","003",20000);
        Account acc4 = new Account("John","004",1000);
        Account acc5 = new Account("Miles","005",6000);


        System.out.println(acc1.getBalance());
        acc1.setBalance(50000);
        System.out.println(acc1.getBalance());


        acc2.printDetails();
        acc2.deposit(1000);
        acc2.printDetails();
        acc2.withdraw(300);
        acc2.printDetails();


        String name = "John";
        name.toLowerCase();
        //primitive:something that is not an object
        //mostly marked in blue/int/boolean/double
        int x= 10;
        double z=88;
        boolean finished = true;


        Account[] accounts = {acc1, acc2, acc3, acc4,acc5};
        for (Account K : accounts)
        {
            K.deposit(100);
            K.printDetails();
        }








































        }

    }

