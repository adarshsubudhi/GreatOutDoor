package com.capgemini.go.dao;

import com.capgemini.go.dto.ProductDTO;

public interface RetailerInventoryDao 
{
 void addItemToInventory(ProductDTO pd);
 void viewItemFromInventory(ProductDTO pd);
 void updateItemFromInventory(ProductDTO pd);
 void deleteItemFromInventory(ProductDTO pd);
}
