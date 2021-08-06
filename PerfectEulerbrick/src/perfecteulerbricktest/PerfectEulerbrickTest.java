package perfecteulerbricktest;

public class PerfectEulerbrickTest {

    static int maxnumber = 10000;

    static boolean go = true;
    static int aBase = 1;
    static int bBase = 1;
    static int cBase = 1;//740

    static int a = 1;
    static int b = 1;
    static int c = 1;

    static int test = 0;
    static int test2 = 0;

    public static void main(String[] args) {

        while (go) {

            test++;

            a++;
            if (test == maxnumber) {
                test = 0;
                a = aBase;
                b++;
                test2++;
                if (test2 == maxnumber) {
                    test2 = 0;

                    b = bBase;
                    c++;
                    System.out.println("Tested " + c + "/" + maxnumber + " possibilities");
                    if (c == 1000) {
                        System.out.println("stoped");
                        go = false;
                    }
                }
            }

            if (a != b && b != c && c != a) {
                double f = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
                if (f % 1 == 0) {
                    double d = Math.sqrt((Math.pow(b, 2) + Math.pow(c, 2)));
                    if (d % 1 == 0) {
                        double e = Math.sqrt((Math.pow(a, 2) + Math.pow(c, 2)));
                        if (e % 1 == 0) {
                            double g = Math.sqrt((Math.pow(c, 2) + Math.pow(f, 2)));
                            if (g % 1 == 0) {
                                go = false;
                                System.out.println("done - found perfect euler brick");
                                System.out.println(a);
                                System.out.println(b);
                                System.out.println(c);
                            }
                        }
                    }
                }
            }

        }

    }

}
