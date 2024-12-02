package Java102;

import java.util.ArrayList;

public class Main {
        // Practice 7) returnAll
        public static void main(String[] args) {
        
            Libraryitem[] items = {
            new Book("NAME", "123", "author", 10),
            new DVD("NAME", "235", 1.0)
        }; 

        returnAll(items);
    }

        public static void returnAll(Libraryitem[] items) {
            for (Libraryitem item : items) {
                item.returnItem();
            }


    }

    //Practice 8) availableItems
    public static ArrayList<Libraryitem> availableItems(Libraryitem[] items) {
        ArrayList<Libraryitem> availableItems = new ArrayList<>();

        for (Libraryitem item : items) {
            if (item.available()) {
                availableItems.add(item);
            }
        }

        return availableItems;

    }
    
}
