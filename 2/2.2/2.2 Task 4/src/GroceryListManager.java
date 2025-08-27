import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GroceryListManager {
    private HashMap<String, Item> groceryList = new HashMap<>();
    static class Item {
        double cost;
        String category;
        int quantity;

        Item(double cost, String category, int quantity) {
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }
    }
    public GroceryListManager() {}
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.put(item, new Item(cost, category, quantity));
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void updateQuantity(String item, int newQuantity) {
        groceryList.get(item).quantity = newQuantity;
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
            cost += entry.getValue().cost * entry.getValue().quantity;
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
    public void displayAvailableItems() {
        System.out.println("Available Items in list:");
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            if (entry.getValue().quantity > 0) {
                System.out.printf("%s %d\n", entry.getKey(), entry.getValue().quantity);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Milk", 1, "Dairy", 3);
        groceryListManager.addItem("Cheese", 1, "Dairy", 0);
        groceryListManager.addItem("Chicken", 1, "Meat", 5);
        System.out.println();
        groceryListManager.displayByCategory("Dairy");
        groceryListManager.displayList();
        groceryListManager.displayAvailableItems();
        System.out.printf("Total cost of the list is: %2.0f\n",  groceryListManager.calculateTotalCost());

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
        System.out.println();
        groceryListManager.updateQuantity("Cheese", 1);
        if (groceryListManager.checkItem("Burger")) System.out.println("Burger is on the list.");
        else  System.out.println("Burger is not on the list.");
        System.out.println();
        groceryListManager.removeItem("Milk");
        groceryListManager.displayList();
        groceryListManager.displayByCategory("Dairy");
        groceryListManager.displayAvailableItems();
        System.out.printf("Total cost of the list is: %2.0f\n",  groceryListManager.calculateTotalCost());

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
    }
}
