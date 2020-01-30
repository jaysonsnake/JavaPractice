package practice;
import java.util.Scanner;

/**
 * @author Coco
 * 用不同算法，求两个数的最大公约数
 */
public class GreatestCommonFactor {

    private Scanner input = new Scanner(System.in);

    /**
     * 枚举
     */
    private void eNum() {

        // 分别输入2个整数a和b，并初始化gcd（最大公约数）为1
        int a = input.nextInt();
        int b = input.nextInt();
        int gcd = 1;

        // 设i为2，i不能大于a，且i不能大于b
        for (int i = 2; i <= a && i <= b; i++)
        {
            // 如果a和b都能被i整除，则记下i；重复此步骤，直到i==a或i==b
            if (a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }
        System.out.println(a + "和" + b + "的最大公约数是" + gcd);
    }


    /**
     * 欧几里得法（辗转相除法）
     */
    private void euclid() {

        // 分别输入2个整数a和b，并记录原始a和b
        int a = input.nextInt();
        int b = input.nextInt();
        int oa = a;
        int ob = b;

        // 如果b==0，计算结束退出循环，此时a为最大公约数
        while (b != 0)
        {
            // 否则，取a除以b的余数r，让a=b，b=r，再循环
            int r = a % b;
            // 查看计算过程
            System.out.println("a=" + a + ", " + "b=" + b + ", " + "r=" + r);
            a=b;
            b=r;
        }

        System.out.println(oa + "和" + ob + "的最大公约数是：" + a);
    }

    public static void main(String[] args) {
        GreatestCommonFactor greatestCommonFactor = new GreatestCommonFactor();
        greatestCommonFactor.euclid();
    }
}

