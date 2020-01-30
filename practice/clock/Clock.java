package practice.clock;

/**
 * 调用两次Display类，一次代表hour，一次代表minute
 * */
public class Clock {

    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start() {
        while (true) {
            minute.increase();

            if (minute.getValue() == 0) {
                hour.increase();
            }
            // %02d 表示输出两位字符，不满两位用0填充
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }


    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }

}
