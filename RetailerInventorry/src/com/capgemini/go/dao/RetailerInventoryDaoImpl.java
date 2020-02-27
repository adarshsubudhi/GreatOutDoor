package com.capgemini.go.dao;

import java.io.DataInputStream;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.log4j.Logger;

import com.capgemini.go.dto.ProductDTO;

public class RetailerInventoryDaoImpl implements RetailerInventoryDao {
	private Logger logger = Logger.getLogger(RetailerInventoryDaoImpl.class) ;
	static HashMap<String, ProductDTO> h=new HashMap<>();

	@Override
	public void addItemToInventory(ProductDTO pd)
	{
		Iterator<String> ii=h.keySet().iterator();
		
	while(ii.hasNext())
	{
		String k=(String)ii.next();
		if(k.equals(pd.getRetailerName()))
		{
			h.put(pd.getRetailerName()+(int)(Math.random()*1000), pd);
			System.out.println("sucessfully item added");
			
			
		}
	}
		h.put(pd.getRetailerName(), pd);
		
		System.out.println("sucessfully item added");
		return  ;
		
		
	}

	@Override
	public void viewItemFromInventory(ProductDTO pd) {
		Scanner dis=new Scanner(System.in);
		Iterator<String> ii=h.keySet().iterator();
		
		while(ii.hasNext())
		{
			String k=(String)ii.next();
			if(k.equals(pd.getRetailerName()) || k.contains(pd.getRetailerName()))
			{
				if(h.get(pd.getRetailerName()) instanceof ProductDTO)
				{
				ProductDTO pd1=(ProductDTO)h.get(k);
				System.out.print(" Product:"+pd1.getProduct());
				System.out.println("\tQuantity :"+pd1.getQuantity());
				
				
				
				
				}
			}
		}
		return  ;
		
		
	}

	@Override
	public void updateItemFromInventory(ProductDTO pd)
	{
		String name=pd.getRetailerName();
		Scanner ss=new Scanner(System.in);
			System.out.println("Enter the product u want to update");
			String product=ss.nextLine();
			System.out.println("Enter the quanity");
			int quant=ss.nextInt();
			
			Iterator<String> ii=h.keySet().iterator();
			while(ii.hasNext())
			{
				String n=ii.next();
				if(n.contains(name))
				{
					ProductDTO p=(ProductDTO)h.get(n);
					if(p.getProduct().equals(product))
					{
						ProductDTO p1=new ProductDTO();
						p1.setQuantity(quant);
						p1.setProduct(product);
						h.put(n,p1);
						System.out.println("Product is updated");
					}
				}
			}
			//return ;
			
		}
		

	

	@Override
	public void deleteItemFromInventory(ProductDTO pd) {
		String name=pd.getRetailerName();
		Scanner ss=new Scanner(System.in);
			System.out.println("Enter the product u want to remove");
			String product=ss.nextLine();
			Iterator<String> ii=h.keySet().iterator();
			while(ii.hasNext())
			{
				String n=ii.next();
				if(n.contains(name))
				{
					ProductDTO p=h.get(n);
					if(p.getProduct().equals(product))
					{
						ii.remove();
						System.out.println("Product is removed ");
					}
				}
			}
			return ;
			
		}
		

		
	}


