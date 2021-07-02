package com.shp.bbca;
import java.util.Scanner;
public class main {

  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Welcome to Ramsay's");
  	System.out.println("To order South Indian Dishes, Press 1.");
  	System.out.println("To order Italian Dishes, Press 2.");
  	System.out.println("To order Rajasthani Dishes, Press 3.");
  	System.out.println("To order Desserts, Press 4.");
  	System.out.print("Enter a Choice: ");
  	byte choice = sc.nextByte();
  	switch(choice){
  		case 1:
  			System.out.println("We serve the following South Indian Dishes:");
  			System.out.println("\t1. Masala Dosa");
  			System.out.println("\t2. Idli");
  			System.out.println("\t3. Vada");
  			System.out.println("\t4. Paper Dosa");
  			System.out.println("\t5. Rava");
  			System.out.print("Enter a Choice: ");
  			byte c1 = sc.nextByte();
  			break;
  		case 2:
  			System.out.println("We serve the following Italian Dishes:");
  			System.out.println("\t1. Pasta");
  			System.out.println("\t2. Lasanga");
  			System.out.println("\t3. Pineapple Pizza");
  			System.out.println("\t4. Ravioli");
  			System.out.println("\t5. Mozarella Cheese Pizza");
  			byte c2 = sc.nextByte();
  			break;
  		case 3:
  			System.out.println("We serve the following Rajasthani Dishes:");
  			System.out.println("\t1. Gatte Ki Sabzi");
  			System.out.println("\t2. Laal Maas");
  			System.out.println("\t3. Ghevar");
  			System.out.println("\t4. Kachori");
  			System.out.println("\t5. Mirchi Bada");
  			byte c3 = sc.nextByte();
  			break;
  		case 4:
  			System.out.println("We serve the following Rajasthani Dishes:");
  			System.out.println("\t1. Soft Serve Ice Cream");
  			System.out.println("\t2. Mishti Doi");
  			System.out.println("\t3. Rasgulla");
  			System.out.println("\t4. Kala Jamun");
  			System.out.println("\t5. Chocolate Milkshake");
  			byte c4 = sc.nextByte();
  			break;
  		default :
  			System.out.println("You entered a wrong choice...");
  	}
  	System.out.println("Thank you, your order has been placed successfully\nIt will arrive in almost 20 minutes.");
  	System.out.println("Thanks for contacting Ramsay's, Have a nice day!");
  }
}
