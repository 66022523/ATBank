/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.adhoccom.atbank;

import java.util.Random;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dermh
 */
public class Main {

    public static abstract class Bank implements Serializable {

        protected double balance;

        public Bank(double balance) {
            this.balance = balance;
        }

        abstract public double checkBalance();

        abstract public void deposit(double amount);

        abstract public void withdraw(double amount);

        abstract public void transfer(Account toAccount, double amount);
    }

    public static class Account extends Bank implements Serializable {

        private String id;
        private String name;
        private String password;

        public Account(String id, String name, String password) {
            super(1000.0);
            this.id = id;
            this.name = name;
            this.password = password;
        }

        public String getID() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public double checkBalance() {
            return this.balance;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && this.balance >= amount) {
                balance -= amount;
            }
        }

        @Override
        public void transfer(Account toAccount, double amount) {
            if (amount > 0 && this.balance >= amount) {
                this.balance -= amount;
                toAccount.deposit(amount);
            }
        }
    }

    public static class User implements Serializable {

        private final ArrayList<Account> accounts = new ArrayList<>();

        public User() {
            String filename = "accounts.ser";
            ArrayList<Account> object = null;

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                object = (ArrayList<Account>) in.readObject();
            } catch (IOException e) {
                System.out.println("Input: IOException is caught");
            } catch (ClassNotFoundException e) {
                System.out.println("ClassNotFoundException is caught");
            }

            if (object != null) {
                this.accounts.addAll(object);
            }
        }

        public boolean exists(String name) {
            for (Account account : this.accounts) {
                if (account.getName().equals(name)) {
                    return true;
                }
            }
            return false;
        }

        public Account login(String id, String password) {
            for (Account account : this.accounts) {
                if (account.getID().equals(id) && account.getPassword().equals(password)) {
                    return account;
                }
            }
            return null;
        }

        public Account register(String name, String password) {
            if (!exists(name)) {
                String filename = "accounts.ser";
                Random random = new Random();
                StringBuilder id = new StringBuilder();

                for (int i = 0; i < 12; i++) {
                    id.append(random.nextInt(10));
                }

                Account account = new Account(id.toString(), name, password);

                this.accounts.add(account);

                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
                    out.writeObject(this.accounts);
                } catch (IOException e) {
                    System.out.println("Output: IOException is caught");
                }

                return account;
            }
            return null;
        }
    }
}
