import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println();
    }
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }
    public double calculateTotalCost() {
        double cost = 0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            cost += entry.getValue();
        }
        return cost;
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Milk", 1);
        groceryListManager.addItem("Cheese", 1);
        groceryListManager.addItem("Chicken", 1);
        System.out.println();
        groceryListManager.displayList();
        System.out.printf("Total cost of the list is: %2.0f\n",  groceryListManager.calculateTotalCost());

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
        System.out.println();
        if (groceryListManager.checkItem("Burger")) System.out.println("Burger is on the list.");
        else  System.out.println("Burger is not on the list.");
        System.out.println();
        groceryListManager.removeItem("Milk");
        groceryListManager.displayList();
        System.out.printf("Total cost of the list is: %2.0f\n",  groceryListManager.calculateTotalCost());

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
    }
}
