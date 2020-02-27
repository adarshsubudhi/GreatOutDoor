package com.capgemini.go.maincontroller;


import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.capgemini.go.service.RetailorInventoryService;
import com.capgemini.go.service.RetailorInventoryServiceImpl;

public class Main 
{
public static void main(String[] args) throws Exception 
{
	DataInputStream dis=new DataInputStream(System.in);
	
	RetailorInventoryService oos = new RetailorInventoryServiceImpl();
	while(true)
	{
		menu();
		System.out.println("enter your option:");
		int ch = 0;
		try {
		  ch=Integer.parseInt(dis.readLine());
		  
		}catch(NumberFormatException e) {
			System.out.println("PLease Enter Numerical values only!!");
		}
		switch(ch) 
		{
		case 1:
		    oos.addItemToInventory();
			break;
		case 2:
			oos.updateItemFromInventory();
			break;
		case 3:
			oos.viewItemFromInventory();
			break;
		case 4:
			oos.deleteItemFromInventory();
			break;
		case 5:
			System.out.println("Thanks for Using");
			return;
			default:
				System.out.println("Please enter option from 1 to 5 only!!  ");
		}
	} 
	
}

private static void menu() 
{
	System.out.println(" Inventory \n=========================");
	System.out.println("1.Add  ");
	System.out.println("2.Update  ");
	System.out.println("3.View");
	System.out.println("4.Delete");
	System.out.println("5.Quit");
	
}
}
