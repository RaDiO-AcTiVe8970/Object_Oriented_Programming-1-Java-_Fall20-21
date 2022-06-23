package classes;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setFid(String fid)
	{
		this.fid = fid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String getFid()
	{
		return fid;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	
	public abstract void showInfo();
	
	public void sellQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Price: "+ price);
			System.out.println("Sold Quantity: "+ amount);
			price += amount;
			System.out.println("Current Price: "+ price);
		}
		else
		{
			System.out.println("Can Not Sell Quantity");
		}
	}
	public void addQuantity(int amount)
	{
		if(amount>0 && amount<=price)
		{
			System.out.println("Previous Price:	"+ price);
			System.out.println("Added Quantity:	"+ amount);
			price -= amount;
			System.out.println("Current Price:	"+ price);
		}
		else
		{
			System.out.println("Can Not Add Quantity");
		}
	}	
}