package classes;
import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
	private FoodItem foodItem[] = new FoodItem [10];
	
	
	public void setRid(String rid)
	{
		this.rid = rid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getRid()
	{
		return rid;
	}
	public String getName()
	{
		return name;
	}
	
	public void insertFoodItem(FoodItem f)
	{
		int flag = 0;
		
		for(int i=0; i<foodItem.length; i++)
		{
			if(foodItem[i] == null)
			{
				foodItem[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeFoodItem(FoodItem f)
	{
		int flag = 0;
		for(int i=0; i<foodItem.length; i++)
		{
			if(foodItem[i] == f)
			{
				foodItem[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("FoodItem Removed");
		}
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	
	public void showAllFoodItems()
	{
		for(FoodItem f : foodItem)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
	}
	
	public FoodItem getFoodItem(String fid)
	{
	        FoodItem f = null;
		
		for(int i=0; i<foodItem.length; i++)
		{
			if(foodItem[i] != null)
			{
				if(foodItem[i].getFid() == fid)
				{
					f = foodItem[i];
					break;
				}
			}
		}
		return f;
	}
}