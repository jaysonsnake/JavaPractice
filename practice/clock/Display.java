package practice.clock;

public class Display {
    private int value = 0;
    private int limit = 0;


    /**
     * 构造函数，每当new Display()，都会调用这个方法
     * @param limit 时间上限，如：24，60
     * */
    public Display(int limit) {
        this.limit = limit;
    }


    /**
     * 让value自增1，如果value达到上限，则重置为0
     * */
    public void increase() {
        value++;
        if (value == limit) {
            value = 0;
        }
    }


    public int getValue() {
        return  value;
    }




    public static void main(String[] args) {
        Display c = new Display(24);
    }
}
