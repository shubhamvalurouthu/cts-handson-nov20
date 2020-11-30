package com.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		String s = null;
		int n=0;
		
		AccountService service = new AccountServiceImpl();
		List<AccountDetails> list =new ArrayList<AccountDetails>();
		
		do {
			System.out.println("1: Add Account");
			System.out.println("2: Remove Account");
			System.out.println("3: Find Account by Account-number");
			System.out.println("4: Display all Accounts");
			System.out.println("5: Display Accounts having the balance less than 1000");

			System.out.print("Enter your Choice : ");

			n = sc.nextInt();
			switch (n) {
			case 1:

				System.out.print("Enter accountNumber : ");
				Integer id = sc.nextInt();

				System.out.print("Enter Balance : ");
				Double balance = sc.nextDouble();
				
				try {
					service.add(id, balance);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				System.out.println(e);
				}

				break;
				
			case 2:
				System.out.print("Remove the account number : ");
				Integer accountNumber = sc.nextInt();
				try {
					service.removeAccount(accountNumber);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;

			case 3:
				System.out.print("Find the account number : ");
				Integer accountNumber1 = sc.nextInt();
				try {
					list = service.findAccountByAccountNumber(accountNumber1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 4:
				list = service.displayAllAccounts();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 5:
				list = service.displayAccountsHavingThBalanceLessThan1000();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;
			default:
				System.out.println("Wrong Input Entered - Try again--");
				break;
			}

			System.out.print("Do you want to continue (y or n) :");
		
			s = sc1.nextLine().toLowerCase();
			

		} while (s.equals("y"));

		System.out.println("Thankyou for using application...");
		
		
		
	}

}
