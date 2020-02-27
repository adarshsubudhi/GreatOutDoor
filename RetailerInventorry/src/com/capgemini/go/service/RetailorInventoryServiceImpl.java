package com.capgemini.go.service;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.capgemini.go.dao.RetailerInventoryDao;
import com.capgemini.go.dao.RetailerInventoryDaoImpl;
import com.capgemini.go.dto.ProductDTO;

public class RetailorInventoryServiceImpl implements RetailorInventoryService 
{
	DataInputStream dis=new DataInputStream(System.in);

	@Override
	public void addItemToInventory() {
		System.out.println("Enter RetailerName ");
		String uname="";
		try {
			 uname = dis.readLine();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("Enter product ");
		String pdt="";
		try {
			pdt = dis.readLine();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		System.out.println("Enter quantity ");
		int quantity = 0;
		try {
			quantity = Integer.parseInt(dis.readLine());
		} catch (NumberFormatException e) {
			
			System.out.println("Please enter numeric values only!!");
		} catch (IOException e) {
			
			e.printStackTrace();
		};
		ProductDTO po=new ProductDTO();
		po.setRetailerName(uname);
		po.setProduct(pdt);
		po.setQuantity(quantity);
		RetailerInventoryDao oo=new RetailerInventoryDaoImpl();
		oo.addItemToInventory(po);
		
	}

	@Override
	public void viewItemFromInventory() 
	{
		
		System.out.println("Enter the RetailerName:");
		String un = "";
		try {
			un = dis.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		ProductDTO po=new ProductDTO();
		po.setRetailerName(un);
		RetailerInventoryDao oo=new RetailerInventoryDaoImpl();
		oo.viewItemFromInventory(po);
		
		
		
	}

	

	

	@Override
	public void updateItemFromInventory() {
		
		System.out.println("Enter the RetailerName:");
		String un = "";
		try {
			un = dis.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ProductDTO po=new ProductDTO();
		po.setRetailerName(un);
		RetailerInventoryDao oo=new RetailerInventoryDaoImpl();
		oo.updateItemFromInventory(po);
		
	}

	@Override
	public void deleteItemFromInventory() {
		
		System.out.println("Enter the RetailerName:");
		String un = "";
		try {
			un = dis.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ProductDTO po=new ProductDTO();
		po.setRetailerName(un);
		RetailerInventoryDao oo=new RetailerInventoryDaoImpl();
		oo.deleteItemFromInventory(po);
		
	}

}
