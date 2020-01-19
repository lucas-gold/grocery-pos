import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JTextArea;

public class GroceryCart 
{
	private ArrayList<GroceryItem> items;
	int currentIndex;
	
	public GroceryCart()
	{
		items = new ArrayList<GroceryItem>();
		currentIndex = -1;
	}
	
	public GroceryItem removeTopItem()
	{
		if (items.size() > 0)
		{
		  currentIndex--;
		  if (currentIndex < 0) currentIndex = 0;
		  return items.remove(0);
		}
		return null;
	}
	
	public void startViewing()
	{
		currentIndex = 0;
	}
	
	public GroceryItem viewNextItem()
	{
		GroceryItem next = null;
		
		if (currentIndex >= 0 && currentIndex < items.size())
		{
		  next = items.get(currentIndex);
		  currentIndex++;
		}
		return next;
	}
	
	public void addItem(GroceryItem item)
	{
	   items.add(item);
	}
	
	public void display(JTextArea displayArea)
	{
	  displayArea.setText("");
	  
	  for (int i = 0; i < items.size(); i++)
	  {
	    displayArea.append(items.get(i).getLabel() + "\n\n");
	  }
	}
	
	public void clear()
	{
		items = new ArrayList<GroceryItem>();
		currentIndex = -1;
	}
	
	public void fill()
	{
		GroceryItem item;
		
		item = new GroceryItem(111,"Bananas",3.25);
		items.add(item);
		item = new GroceryItem(222,"Apple",2.99);
		items.add(item);
		item = new GroceryItem(333,"Grapes",4.72);
		items.add(item);
		item = new GroceryItem(222,"Apple",2.99);
		items.add(item);
		item = new Meat(435,"Steak",11.99,2);
		items.add(item);
		item = new Dairy(654,"Milk",2.99,2);
		items.add(item);
		item = new GroceryItem(725,"Carrots",3.99);
		items.add(item);
		item = new Meat(435,"Roast Beef",13.99,4);
		items.add(item);
	}
}
