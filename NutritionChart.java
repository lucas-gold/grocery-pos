import java.util.ArrayList;

public class NutritionChart 
{
   ArrayList<FoodType> foods; 
   
   public NutritionChart()
   {
	   foods = new ArrayList<FoodType>();
	   
	   // Initialize Chart
	   foods.add(new FoodType(111, "bananas", 1, 180, 20, 0, 25));
	   foods.add(new FoodType(222, "apples", 1, 80, 22, 0, 20));
	   foods.add(new FoodType(333, "grapes", 1, 120, 15, 0, 15));
	   foods.add(new FoodType(435, "beef", 1, 250, 0, 15, 8));
	   foods.add(new FoodType(654, "milk", 1, 90, 12, 7, 4));
	   foods.add(new FoodType(725, "carrots", 1, 15, 4, 0, 16));
   }
   
   public FoodType getFoodType(int foodCode)
   {
	   for (int i = 0; i < foods.size(); i++)
	   {
		   FoodType food = foods.get(i);
		   if (food.code == foodCode)
			   return new FoodType(food.code,food.label,food.measure,food.kcal,food.sugar,food.fat,food.carbs);
	   }
	   return null;
   }
}
