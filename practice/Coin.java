package practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 根据硬币面额，获取对应的英文单词
 *
 * @author Coco
 *
 * @date 2020/01/29
 *
 */
public class Coin {

    private HashMap<Integer, String> coinNames = new HashMap<>();


    public Coin() {
        coinNames.put(1, "penny");
        coinNames.put(10, "dime");
        coinNames.put(25, "quarter");
        coinNames.put(50, "half-dollar");
        coinNames.put(100, "dollar");
    }

    /**
     * @param amount 传入钱
     * @return 面值对应的钱币名称
     */
    private String getName(int amount) {
        return coinNames.getOrDefault(amount,  "NOT FOUND");
    }


    private void getValuesInMap() {
        List<String> values = new ArrayList<>();

        for (Integer k : coinNames.keySet()) {
            values.add(coinNames.get(k));
        }

        System.out.println("values set = " + values);
    }


    public static void main(String[] args) {
        Coin coin = new Coin();

        String name1 = coin.getName(100);
        String name2 = coin.getName(15);
        System.out.println("100 = " + name1);
        System.out.println("15 = " + name2);
        System.out.println("coinNames = " + coin.coinNames);
        coin.getValuesInMap();
    }
}
