package practice;
import java.util.Scanner;

/**
 * @author Coco
 * @date 2019/2/9
 *
 * 用不同算法，获取素数
 */
public class GetPrimes {

    private Scanner input = new Scanner(System.in);


    /**
     * 利用素数定义，获取素数
     * 一个素数不能被之前的所有的素数整除，则视为素数
     * 例如5不能被2,3整除，7不能被2,3,5整除
     */
    private void primeDef() {
        // 存放前50个素数
        int[] primes = new int[50];
        // 第一个素数是2
        primes[0] = 2;
        // 下标从1开始
        int index = 1;

        MAIN_LOOP:
        // 遍历x直到index=50为止
        for (int x = 3; index < 50; x++) {
            // 如果能被数组中的其中一个素数整除，则不视为素数，继续主循环
            for (int i = 0; i < index; i++) {
               if (x % primes[i] == 0) {
                   continue MAIN_LOOP;
               }
            }

            // PrimeDef[index]=x, index再++
            primes[index++] = x;
        }

        // 打印所有素数
        for (int k: primes) {
            System.out.print(k + " ");
        }
    }


    /**
     * 构造n以内素数
     * 素数的n倍数都不是素数，可排除之
     * */
    private void nonPrimes() {
        // 素数的个数n
        int n = input.nextInt();
        boolean[] isPrime = new boolean[n];

        // 把isPrime中的元素全部改为true，因为默认全是false
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // 倍数下标改为false
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                // 倍数k
                for (int k = 2; k*i < isPrime.length; k++) {
                    isPrime[k*i] = false;
                }
            }
        }

        // 打印出来
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i +" ");
            }
        }
    }


    public static void main(String[] args) {
        GetPrimes getPrimes = new GetPrimes();
        getPrimes.nonPrimes();
    }




}
