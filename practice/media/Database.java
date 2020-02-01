package media;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Coco
 * @date 2020/01/30
 */
public class Database {

    public static void main(String[] args) {
        Database database = new Database();
        Item itemCD = new CD("aaa", "aaa", 10, 60, "...");
        Item itemDVD = new DVD("bbb", "bbb", 10, "...");

        itemCD.print();
        itemDVD.print();
    }


}
