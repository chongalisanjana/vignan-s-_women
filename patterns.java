import java.util.*;

public class patterns {
    public static Scanner scn = new Scanner(System.in);

    public static void kaajuKatli(int n) {
        int nsp = n / 2;
        int inNsp = 0;
        for (int row = 0; row < n; row++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int incsp = 0; incsp < inNsp; incsp++) {
                System.out.print("\t");
            }

            if (row == 0 || row == n) {
                continue;
            } else {
                System.out.print("*\t");
            }

            if (row < n / 2) {
                nsp--;
                inNsp += 2;
            } else {
                nsp++;
                inNsp -= 2;
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n) {
        int nsp = n / 2;
        int nspp = -1;
        // int nstt = n-n;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int csp = 1; csp <= nspp; csp++) {
                System.out.print("\t");
            }

            if (row > 1 && row < n) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }

            if (row <= n / 2) {
                nspp += 2;
                nsp--;
            } else {
                nspp -= 2;
                nsp++;
            }
            System.out.println("\t");
        }
    }

    public static void fiboPattern(int n) {
        int a = 0;
        int b = 1;
        for (int row = 1; row <= n; row++) {
            for (int csd = 1; csd <= row; csd++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println("\t");
        }
    }

    public static void numPattern1(int n) {
        // 1
        // 1   2
        // 1   2   3
        // 1   2   3   4
        // 1   2   3   4   5
    }

    public static void numPattern2(int n) {
        // 1
        // 2   3
        // 4   5   6
        // 7   8   9   10
        // 11   12  13  14  15
    }


    public static void numPattern3(int n) {
        //         1
        //     2   3   2
        // 3   4   5   4   3
        //     2   3   2
        //         1
    }

    public static void main(String[] args) {
        fiboPattern(scn.nextInt());
    }
}
