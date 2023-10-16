package seedu.duke.data;

import seedu.duke.data.dish.Dish;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> menuItems;

    public Menu(ArrayList<Dish> menuItems) {
        this.menuItems = menuItems;
    }
    public int getSize() {
        return menuItems.size();
    }
    public Dish getDish(int menuID) {
        return menuItems.get(menuID);
    }
    public void removeDish(int menuID) {
        menuItems.remove(menuID);
    }
    public void addDish(Dish dish) {
        menuItems.add(dish);
    }
}
