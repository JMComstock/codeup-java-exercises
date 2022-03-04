package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApp extends Input {

    public boolean yesNo() {
        return super.yesNo();
    }

    public static ArrayList<HashMap<String, String>> addGrocery (ArrayList<HashMap<String, String>> groceryList) {
        Input input = new Input();
        System.out.println("Would you like to enter a new item?");
        if (input.yesNo()) {
            HashMap<String, String> item = new HashMap<>();
            System.out.println("Choose a category from the list");
            System.out.println(
                    "1 - Fruits & Vegetables\n" +
                    "2 - Meat & Seafood\n" +
                    "3 - Bakery & Bread\n" +
                    "4 - Dairy & Eggs\n" +
                    "5 - Deli & Prepared Food\n" +
                    "6 - Pantry\n" +
                    "7 - Frozen Food\n" +
                    "8 - Beverages"
            );
            String category = input.getString();
                switch (category) {
                    case "1":
                        item.put("category", "Fruits & Vegetables");
                        break;
                    case "2":
                        item.put("category", "Meat & Seafood");
                        break;
                    case "3":
                        item.put("category", "Bakery & Bread");
                        break;
                    case "4":
                        item.put("category", "Dairy & Eggs");
                        break;
                    case "5":
                        item.put("category", "Deli & Prepared Food");
                        break;
                    case "6":
                        item.put("category", "Pantry");
                        break;
                    case "7":
                        item.put("category", "Frozen Food");
                        break;
                    case "8":
                        item.put("category", "Beverages");
                        break;
                }

            System.out.println("Item: ");
            String name = input.getString();
            item.put("name",name);
            System.out.println("Quantity: ");
            String quantity = input.getString();
            item.put("quantity", quantity);
            if (Integer.parseInt(item.get("quantity")) > 0) {
                groceryList.add(item);
            }
            return addGrocery(groceryList);
        }
        return groceryList;
    }

    private static void displayList(ArrayList<HashMap<String, String>> groceryList) {
        Input input = new Input();
        HashMap<String, String> categories = new HashMap<>();
        int numSelector = 1;
        for(HashMap<String, String> item : groceryList) {
            if(!categories.containsValue(item.get("category"))) {
                categories.put(String.valueOf(numSelector), item.get("category"));
                numSelector++;
            }
        }
        System.out.print("\n0 - Display Grocery List");
        for(String key : categories.keySet()) {
            System.out.printf("\n%s:\t%s", key, categories.get(key));
        }
        System.out.print("\n9 - Add Item");
        System.out.print("\n10 - Exit:");
        System.out.print("\nEnter option number: ");
        String userInput = input.getString();
        while(!categories.containsKey(userInput) && !userInput.equals("0") && !userInput.equals("9") && !userInput.equals("10")) {
            System.out.println("Try again.\nEnter option number: ");
            userInput = input.getString();
        }
        switch(userInput) {
            case "0":
                if (groceryList.isEmpty()) {
                    System.out.println("There are no items in your grocery list");
                } else {
                    for (String category : categories.values()) {
                        System.out.printf("\n%s ", category);
                        for (HashMap<String, String> item : groceryList) {
                            if (category.equals(item.get("category"))) {
                                System.out.printf("\n\t%s\tqty: %s\n", item.get("name"), item.get("quantity"));
                            }
                        }
                    }
                    break;
                }
            case "9":
                groceryList = addGrocery(groceryList);
                break;
            case "10":
                System.out.println("Exiting Grocery List ... ");
                return;
            default:
                System.out.printf("\n%s: ", categories.get(userInput));
                for (HashMap<String, String> item : groceryList) {
                    if (categories.get(userInput).equals(item.get("category"))) {
                        System.out.printf("\n\t%s\tqty: %s\n", item.get("name"), item.get("quantity"));
                    }
                }
                break;
        }
        displayList(groceryList);
    }


    public static void main(String[] args) {

        ArrayList<HashMap<String, String>> groceryList = new ArrayList<>();
        groceryList = addGrocery(groceryList);
        displayList(groceryList);

    }
}
