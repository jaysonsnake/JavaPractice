package media;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Coco
 * @date 2020/01/30
 */
public class Database {

    private List<Item> itemList = new ArrayList<>();

    public void add(Item item) {
        itemList.add(item);
    }

    public void list() {
        for (Item item : itemList) {
            // 此处print()采用多态，可视为CD中的print()，或DVD中的print()
            item.print();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Database database = new Database();
        database.add(new CD("aaa", "aaa", 10, 60, "..."));
        database.add(new DVD("ccc", "ccc", 10, "..."));

        database.list();
    }


}
