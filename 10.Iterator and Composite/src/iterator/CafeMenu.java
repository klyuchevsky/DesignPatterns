package iterator;//This menu uses java.util.Iterator

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable items = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soap of the day", "A cup of the soap of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        items.put(item.getName(), item);
    }

    public Iterator createIterator() {
        return items.values().iterator();
    }
}
