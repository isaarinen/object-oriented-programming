public class GroceryListTester {
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
