public class Main {

    class Constants {
        public static final double EPS = -1e12;
    }

    public static void main(String[] args) {

        long[] w = new long[11];
        long val = 1;
        for (int i = 0; i < 11; i++) {
            w[i] = val;
            val += 2;
        }

        double[] x = new double[10];
        for (int i = 0; i < 10; i++) {
            x[i] = -5.0 + Math.random() * 15.0;
        }

        double[][] s = new double[11][10];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (w[i] == 1) {
                    s[i][j] = f1(x[j]);
                } else if (w[i] == 3 || w[i] == 7 || w[i] == 9 || w[i] == 13 || w[i] == 21) {
                    s[i][j] = f2(x[j]);
                } else {
                    s[i][j] = f3(x[j]);
                }
            }
        }

        f4(s);
    }

    public static double f1(double x) {
        return Math.tan(Math.pow(x / 3.0, 3)) - 3;
    }

    public static double f2(double x) {
        return Math.log(Math.pow(Math.sin(Math.cos(Math.cbrt(x))), 2));
    }

    public static double f3(double x) {
        return Math.pow(Math.E, Math.cbrt(Math.atan((x + 2.5) / 15.0) / 4.0));
    }

    public static void f4(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%10.4f ", mat[i][j]);
            }
            System.out.println();
        }
    }
}