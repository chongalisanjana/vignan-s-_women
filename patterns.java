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

    public static void hollowSquare(int n) {
        int nsp = n - 2;

        for (int row = 0; row < n; row++) {
            System.out.print("*\t");

            for (int elem = 0; elem < nsp; elem++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println("*\t");

        }
    }

    public static void cross1(int n) {
        int nsp = 0;
        int inNsp = n - 2;
        for (int row = 0; row < n; row++) {
            for (int csp = 0; csp < nsp; csp++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int inCsp = 0; inCsp < inNsp; inCsp++) {
                System.out.print("\t");
            }
            if (row != n / 2) {
                System.out.println("*\t");
            } else {
                System.out.println("\t");
            }

            if (row < n / 2) {
                nsp++;
                inNsp -= 2;
            } else {
                nsp--;
                inNsp += 2;
            }
        }
    }

    public static void cross2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\n");
                }
            }
            System.out.println();
        }
    }

    public static void plusPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


    // 16/04/26
    public static void diamondOfSpaces (int n) {
        // *	*	*	*	*	*	*	*		
        // *	*	*			*	*	*		
        // *	*					*	*		
        // *							*		
                                            
        // *							*		
        // *	*					*	*		
        // *	*	*			*	*	*		
        // *	*	*	*	*	*	*	*
    }

    public static void diamondOfSpaces2(int n) {
        // *	*	*	*		*	*	*	*		
        // *	*	*				*	*	*		
        // *	*						*	*		
        // *								*		
        // *	*						*	*		
        // *	*	*				*	*	*		
        // *	*	*	*		*	*	*	*	
    }
    
    public static void sandTimer(int n) {
        // *	*	*	*	*	*	*		
        //     *				*		
        //         *		*		
        //             *			
        //         *		*		
        //     *			 	*		
        // *	*	*	*	*	*	*		
    }
    
    public static void arrow(int n) {
        //  			*		
        //              *	 *		
        //              *	 *	 *		
        // *	*	*	*	 *	 *	 *		
        //              *	 *	 *		
        //              *	 *		
        //              *	
    }

    public static void nFactorialTillN(int n) {
        // n = 5

        // 1	
        // 5	25	
        // 125	625	3125	
        // 15625	78125	390625	1953125	
        // 9765625	48828125	244140625	1220703125	1808548329	
    }

    public static void numPattern1(int n) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
    }

    public static void numPattern2(int n) {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
    }

    public static void numPattern3(int n) {
        //     1
        //   2 3 2
        // 3 4 5 4 3
        //   2 3 2
        //     1
    }

    public static void numPattern4(int n) {
        //                          1		
        //                     2	3	2		
        //                 3	4	5	4	3		
        //             4	5	6	7	6	5	4		
        //         5	6	7	8	9	8	7	6	5		
        //     6	7	8	9	10	11	10	9	8	7	6		
        // 7   8	9	10	11	12	13	12	11	10	9	8	7	
    }

    public static void numW(int n) {   
        // 1												1	
        // 1	2										2	1	
        // 1	2	3								3	2	1	
        // 1	2	3	4						4	3	2	1	
        // 1	2	3	4	5				5	4	3	2	1	
        // 1	2	3	4	5	6		6	5	4	3	2	1	
        // 1	2	3	4	5	6	7	6	5	4	3	2	1	     
    }

    public static void binomialPattern(int n) {
        // 1	
        // 1	1	
        // 1	2	1	
        // 1	3	3	1	
        // 1	4	6	4	1	
        // 1	5	10	10	5	1	
        // 1	6	15	20	15	6	1	
    }
    public static void main(String[] args) {
        plusPattern(scn.nextInt());
    }
}
