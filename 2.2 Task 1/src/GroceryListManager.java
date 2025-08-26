import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (String s : groceryList) {
            System.out.println(s);
        }
        System.out.println();
    }
    public boolean checkItem(String item) {
        for (String s : groceryList) {
            if (s.equals(item)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Cheese");
        groceryListManager.addItem("Chicken");
        System.out.println();
        groceryListManager.displayList();

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
        System.out.println();
        if (groceryListManager.checkItem("Burger")) System.out.println("Burger is on the list.");
        else  System.out.println("Burger is not on the list.");
        System.out.println();
        groceryListManager.removeItem("Milk");
        groceryListManager.displayList();

        if (groceryListManager.checkItem("Milk")) System.out.println("Milk is on the list.");
        else  System.out.println("Milk is not on the list.");
    }
}
