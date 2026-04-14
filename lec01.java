import java.util.*;

public class lec01 {
    public static Scanner scn = new Scanner(System.in);

    public static void reverseDigs(int n) { 
        int rem = 0;
        while(n != 0) {
            rem = n % 10;
            n /= 10;
            System.out.println(rem);
        }
    }


    public static void fibo(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            temp = a + b;
            a = b; 
            b = temp;
        }
    }


    public static void frequencyOfDig (int n, int digit) {
        int count = 0;
        while (n != 0) {
            int lastDig = n % 10;
            if (lastDig == digit) {
                count++;
            }
            n /= 10;
        }
        System.out.print("The Frequency of " + digit + " is : " + count);
    }

    public static void main(String[] args) {
        frequencyOfDig(scn.nextInt(), scn.nextInt());
    }
}

