import java.util.ArrayList;

public class PancakeHouseMenuIterator implements java.util.Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else return true;
    }

    public void remove() {

    }
}
