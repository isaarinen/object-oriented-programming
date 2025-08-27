import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GroceryListManager {
    private HashMap<String, Item> groceryList = new HashMap<>();
    static class Item {
        double cost;
        String category;

        Item(double cost, String category) {
            this.cost = cost;
            this.category = category;
        }
    }
    public GroceryListManager() {}
    public void addItem(String item, double cost, String category) {
        groceryList.put(item, new Item(cost, category));
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println();
    }
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }
    public double calculateTotalCost() {
        double cost = 0;
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            cost += entry.getValue().cost;
        }
        return cost;
    }
    public void displayByCategory(String category) {
        System.out.printf("%s items in list:\n",  category);
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            if (Objects.equals(entry.getValue().category, category)) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Milk", 1, "Dairy");
        groceryListManager.addItem("Cheese", 1, "Dairy");
        groceryListManager.addItem("Chicken", 1, "Meat");
        System.out.println();
        groceryListManager.displayByCategory("Dairy");
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
        groceryListManager.displayByCategory("Dairy");
        System.out.printf("Total cost of the list is: %2.0f\n",  groceryListManager.calculateTotalCost());

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
    }
}
